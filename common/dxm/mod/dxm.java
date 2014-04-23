package dxm.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import dxm.mod.block.BlockFertilizedBlock;
import dxm.mod.block.BlockMonaziteSand;
import dxm.mod.block.BlockTilledfertilizedBlock;
import dxm.mod.block.cobble.*;
import dxm.mod.block.ore.*;
import dxm.mod.item.*;
import dxm.mod.item.block.cobble.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = dxm.modid, name = "Deus Ex Machina", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class dxm {
    public static final String modid = "dxm";
    public static CreativeTabs tab = new CreativeTabs("DXM");
    public static Block fertilizedBlock;
    public static Block tilledfertilizedBlock;
    public static Block bauxiteOre;
    public static Block cassititeriteOre;
    public static Block coalOre;
    public static Block galenaOre;
    public static Block hematiteOre;
    public static Block limestoneOre;
    public static Block bauxiteCobble;
    public static Block cassititeriteCobble;
    public static Block galenaCobble;
    public static Block hematiteCobble;
    public static Block limestoneCobble;
    public static Block malachiteOre;
    public static Block malachiteCobble;
    public static Block coalCobble;
    public static Block monaziteSand;
    public static Block nativegoldOre;
    public static Block nativegoldCobble;
    public static Block sulfurOre;
    public static Block sulfurCobble;
    public static Block uraniniteOre;
    public static Block uraniniteCobble;
    public static Item bauxiteItem;
    public static Item cassititeriteItem;
    public static Item galenaItem;
    public static Item hematiteItem;
    public static Item limestoneItem;
    // public static Item hempSeeds;
    EventManager eventmanager = new EventManager();

    @EventHandler
    public void load(FMLInitializationEvent event) {
        bauxiteOre = new BlockBauxiteOre(501, Material.rock).setUnlocalizedName("bauxiteOre").setCreativeTab(tab);
        cassititeriteOre = new BlockCassititeriteOre(502, Material.rock).setUnlocalizedName("cassititeriteOre").setCreativeTab(tab);
        galenaOre = new BlockGalenaOre(504, Material.rock).setUnlocalizedName("galenaOre").setCreativeTab(tab);
        hematiteOre = new BlockHematiteOre(506, Material.rock).setUnlocalizedName("hematiteOre").setCreativeTab(tab);
        limestoneOre = new BlockLimestoneOre(507, Material.rock).setUnlocalizedName("limestoneOre").setCreativeTab(tab);
        bauxiteCobble = new BlockBauxiteCobble(508, Material.rock).setUnlocalizedName("bauxiteCobble").setCreativeTab(tab);
        cassititeriteCobble = new BlockCassititeriteCobble(509, Material.rock).setUnlocalizedName("cassititeriteCobble").setCreativeTab(tab);
        galenaCobble = new BlockGalenaCobble(510, Material.rock).setUnlocalizedName("galenaCobble").setCreativeTab(tab);
        hematiteCobble = new BlockHematiteCobble(511, Material.rock).setUnlocalizedName("hematiteCobble").setCreativeTab(tab);
        limestoneCobble = new BlockLimestoneCobble(512, Material.rock).setUnlocalizedName("limestoneCobble").setCreativeTab(tab);
        malachiteOre = new BlockMalachiteOre(513, Material.rock).setUnlocalizedName("malachiteOre").setCreativeTab(tab);
        malachiteCobble = new BlockMalachiteCobble(514, Material.rock).setUnlocalizedName("malachiteCobble").setCreativeTab(tab);
        coalOre = new BlockCoalOre(515, Material.rock).setUnlocalizedName("coalOre");
        coalCobble = new BlockCoalCobble(516, Material.rock).setUnlocalizedName("coalCobble").setCreativeTab(tab);
        monaziteSand = new BlockMonaziteSand(517, Material.sand).setUnlocalizedName("monaziteSand").setCreativeTab(tab);
        nativegoldOre = new BlockNativegoldOre(518, Material.rock).setUnlocalizedName("nativegoldOre").setCreativeTab(tab);
        nativegoldCobble = new BlockNativegoldCobble(519, Material.rock).setUnlocalizedName("nativegoldCobble").setCreativeTab(tab);
        sulfurOre = new BlockSulfurOre(520, Material.rock).setUnlocalizedName("sulfurOre").setCreativeTab(tab);
        sulfurCobble = new BlockSulfurCobble(521, Material.rock).setUnlocalizedName("sulfurCobble").setCreativeTab(tab);
        uraniniteOre = new BlockUraniniteOre(522, Material.rock).setUnlocalizedName("uraniniteOre").setCreativeTab(tab);
        uraniniteCobble = new BlockUraniniteCobble(523, Material.rock).setUnlocalizedName("uraniniteCobble").setCreativeTab(tab);
        fertilizedBlock = new BlockFertilizedBlock(524, Material.rock).setUnlocalizedName("fertilizedBlock").setCreativeTab(tab);
        tilledfertilizedBlock = new BlockTilledfertilizedBlock(525, Material.rock).setUnlocalizedName("tilledfertilizedBlock").setCreativeTab(tab);
        
        GameRegistry.registerBlock(fertilizedBlock, ItemFertilizedBlock.class, modid + (fertilizedBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(tilledfertilizedBlock, ItemTilledfertilizedBlock.class,modid + (tilledfertilizedBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(bauxiteOre, ItemBauxiteCobble.class, modid + (bauxiteOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(cassititeriteOre, ItemCassititeriteCobble.class, modid + (cassititeriteOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(galenaOre, ItemGalenaCobble.class, modid + (galenaOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(hematiteOre, ItemHematiteCobble.class, modid + (hematiteOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(limestoneOre, ItemLimestoneCobble.class, modid + (limestoneOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(bauxiteCobble, ItemBauxiteCobble.class, modid + (bauxiteCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(cassititeriteCobble, ItemCassititeriteCobble.class, modid + (cassititeriteCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(galenaCobble, ItemGalenaCobble.class, modid + (galenaCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(hematiteCobble, ItemHematiteCobble.class, modid + (hematiteCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(limestoneCobble, ItemLimestoneCobble.class, modid + (limestoneCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(malachiteOre, ItemMalachiteCobble.class, modid + (malachiteOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(malachiteCobble, ItemMalachiteCobble.class, modid + (malachiteCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(coalOre, ItemCoalCobble.class, modid + (coalOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(coalCobble, ItemCoalCobble.class, modid + (coalCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(monaziteSand, ItemMonaziteSand.class, modid + (monaziteSand.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(nativegoldOre, ItemNativegoldCobble.class, modid + (nativegoldOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(nativegoldCobble, ItemNativegoldCobble.class, modid + (nativegoldCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(sulfurOre, ItemSulfurCobble.class, modid + (sulfurOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(sulfurCobble, ItemSulfurCobble.class, modid + (sulfurCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(uraniniteOre, ItemUraniniteCobble.class, modid + (uraniniteOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(uraniniteCobble, ItemUraniniteCobble.class, modid + (uraniniteCobble.getUnlocalizedName().substring(5)));
        

        // hempSeeds = new ItemHempSeeds(5006, 1, 0).setUnlocalizedName("hempSeeds");
        // LanguageRegistry.addName(hempSeeds, "Hemp Seeds");
        
        GameRegistry.registerWorldGenerator(eventmanager);
    }
}