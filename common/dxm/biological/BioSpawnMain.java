package dxm.biological;

import java.lang.reflect.Field;
import java.util.ArrayList;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import dxm.biological.block.BioTestBlock;
import dxm.biological.items.BioSpawnSeed;
import dxm.biological.items.ItemHemp;
import dxm.biological.sided.BioCommonProxy;
import dxm.machines.HempBlock;

@Mod(modid = "dxmm", name = "Deus Ex Machina", version = "0.1.0", useMetadata = true)
// , dependencies="required-after:GregTech_Addon")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class BioSpawnMain
{
    static boolean GTExists = false;
    public static final String modID = "mensrea_dxm";
    public static ArrayList<ItemStack> noCure = new ArrayList<ItemStack>();
    // noCure is used for potion effects, to make it so that milk can not clear drug effects, if I don't want it to
    public static ItemSeeds HempSeeds;
    public static Item HempItem;
    public static BlockCrops HempBlock;
    public static final String tex = "/mensrea_dxm/textures/items/hempSeed.png";
    @SidedProxy(clientSide = "bio.src.BioClientProxy", serverSide = "bio.src.BioCommonProxy")
    public static BioCommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.RegisterRenderThings(); // Watch use of this in the future
        BioSpawnConfig.configurate(event);
        Potion[] potionTypes = null;
        try
        // Through reflection magic, extends the array size of the Potion class
        {
            for (Field f : Potion.class.getDeclaredFields())
            {
                if ((f.getName().equals("potionTypes")) || (f.getName().equals("field_76425_a")))
                {
                    f.setAccessible(true);
                    Field modifiers = Field.class.getDeclaredField("modifiers");
                    modifiers.setAccessible(true);
                    modifiers.setInt(f, f.getModifiers() & 0xFFFFFFEF);
                    potionTypes = (Potion[]) f.get(null);
                    Potion[] newPotions = new Potion[128];
                    System.arraycopy(potionTypes, 0, newPotions, 0, potionTypes.length);
                    f.set(null, newPotions);
                }
            }
        } catch (Exception e)
        {
            System.err.println("Oops... There's a problem. Tell laserbeam_nik about this:");
            e.printStackTrace();
        }
        try
        // Reflection magic to get rid of all potion swirls, but has side effect of making potions in bottle black
        {
            Potion p;
            for (Field fi : (Potion.class.getDeclaredFields()))
            {
                if (fi.getName().equals("liquidColor") || fi.getName().equals("field_76414_N"))
                {
                    fi.setAccessible(true);
                    for (Field f : Potion.class.getDeclaredFields())
                    {
                        if (f.get(null) instanceof Potion)
                        {
                            p = ((Potion) f.get(null));
                            fi.setInt(p, new Integer(0));
                        }
                    }
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        MinecraftForge.EVENT_BUS.register(new BioSpawnEventHooks());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        BioTestBlock biotestBlock = new BioTestBlock(2996, Material.clay); // Test block for use in theoretical tests of concept
        GameRegistry.registerBlock(biotestBlock, "Bio Test Block");
        LanguageRegistry.addName(biotestBlock, "Bio Test Block");
        HempSeeds = new BioSpawnSeed(BioSpawnConfig.HempSeedsID, BioSpawnConfig.HempBlockID, "HempSeeds", 48);
        HempItem = new ItemHemp(BioSpawnConfig.HempItemID).setUnlocalizedName("HempItem").setCreativeTab(CreativeTabs.tabMisc);
        HempBlock = new HempBlock(BioSpawnConfig.HempBlockID,
                                  0,
                                  HempSeeds,
                                  HempItem,
                                  BioSpawnConfig.HempFertileGrowth,
                                  BioSpawnConfig.HempNonFertileGrowth,
                                  "Hemp");
        MinecraftForge.addGrassSeed(new ItemStack(HempSeeds, 1), 10);
        LanguageRegistry.addName(HempSeeds, "Hemp Seed");
        LanguageRegistry.addName(HempBlock, "Hemp Block");
        BioSpawnDamageSource.localize();
    }
}