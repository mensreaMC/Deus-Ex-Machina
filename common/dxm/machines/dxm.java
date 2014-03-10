package dxm.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import dxm.machines.block.BlockFertilizedBlock;
import dxm.machines.block.BlockMonaziteSand;
import dxm.machines.block.BlockSqueeBlock;
import dxm.machines.block.BlockTilledfertilizedBlock;
import dxm.machines.block.cobble.BlockBauxiteCobble;
import dxm.machines.block.cobble.BlockCassititeriteCobble;
import dxm.machines.block.cobble.BlockCoalCobble;
import dxm.machines.block.cobble.BlockGalenaCobble;
import dxm.machines.block.cobble.BlockHematiteCobble;
import dxm.machines.block.cobble.BlockLimestoneCobble;
import dxm.machines.block.cobble.BlockMalachiteCobble;
import dxm.machines.block.cobble.BlockNativegoldCobble;
import dxm.machines.block.cobble.BlockSulfurCobble;
import dxm.machines.block.cobble.BlockUraniniteCobble;
import dxm.machines.block.ore.BlockBauxiteOre;
import dxm.machines.block.ore.BlockCassititeriteOre;
import dxm.machines.block.ore.BlockCoalOre;
import dxm.machines.block.ore.BlockGalenaOre;
import dxm.machines.block.ore.BlockHematiteOre;
import dxm.machines.block.ore.BlockLimestoneOre;
import dxm.machines.block.ore.BlockMalachiteOre;
import dxm.machines.block.ore.BlockNativegoldOre;
import dxm.machines.block.ore.BlockSulfurOre;
import dxm.machines.block.ore.BlockUraniniteOre;
import dxm.machines.items.ItemBauxite;
import dxm.machines.items.ItemBauxiteCobble;
import dxm.machines.items.ItemCassititerite;
import dxm.machines.items.ItemCassititeriteCobble;
import dxm.machines.items.ItemCoalCobble;
import dxm.machines.items.ItemFertilizedBlock;
import dxm.machines.items.ItemGalena;
import dxm.machines.items.ItemGalenaCobble;
import dxm.machines.items.ItemHematite;
import dxm.machines.items.ItemHematiteCobble;
import dxm.machines.items.ItemLimestone;
import dxm.machines.items.ItemLimestoneCobble;
import dxm.machines.items.ItemMalachiteCobble;
import dxm.machines.items.ItemMonaziteSand;
import dxm.machines.items.ItemNativegoldCobble;
import dxm.machines.items.ItemSquee;
import dxm.machines.items.ItemSqueeBlock;
import dxm.machines.items.ItemSulfurCobble;
import dxm.machines.items.ItemTilledfertilizedBlock;
import dxm.machines.items.ItemUraniniteCobble;

@Mod(modid = dxm.modid, name = "Deus Ex Machina", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class dxm
{
    public static final String modid = "mensrea_dxm";
    // public static Block OreMetaBlock;
    public static Block fertilizedBlock;
    public static Block tilledfertilizedBlock;
    public static Block squeeBlock;
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
    public static CreativeTabs tab = new CreativeTabs("tab");
    public static Item squeeItem;
    public static Item bauxiteItem;
    public static Item cassititeriteItem;
    public static Item galenaItem;
    public static Item hematiteItem;
    public static Item limestoneItem;
    // public static Item hempSeeds;
    EventManager eventmanager = new EventManager();

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        // OreMetaBlock = new OreMetaBlock(Ids.oreMetaBlock_actual);
        fertilizedBlock = new BlockFertilizedBlock(524, Material.rock).setUnlocalizedName("fertilizedBlock");
        tilledfertilizedBlock = new BlockTilledfertilizedBlock(525, Material.rock).setUnlocalizedName("tilledfertilizedBlock");
        squeeBlock = new BlockSqueeBlock(500, Material.sand).setUnlocalizedName("squeeBlock");
        bauxiteOre = new BlockBauxiteOre(501, Material.rock).setUnlocalizedName("bauxiteOre");
        cassititeriteOre = new BlockCassititeriteOre(502, Material.rock).setUnlocalizedName("cassititeriteOre");
        galenaOre = new BlockGalenaOre(504, Material.rock).setUnlocalizedName("galenaOre");
        hematiteOre = new BlockHematiteOre(506, Material.rock).setUnlocalizedName("hematiteOre");
        limestoneOre = new BlockLimestoneOre(507, Material.rock).setUnlocalizedName("limestoneOre");
        bauxiteCobble = new BlockBauxiteCobble(508, Material.rock).setUnlocalizedName("bauxiteCobble");
        cassititeriteCobble = new BlockCassititeriteCobble(509, Material.rock).setUnlocalizedName("cassititeriteCobble");
        galenaCobble = new BlockGalenaCobble(510, Material.rock).setUnlocalizedName("galenaCobble");
        hematiteCobble = new BlockHematiteCobble(511, Material.rock).setUnlocalizedName("hematiteCobble");
        limestoneCobble = new BlockLimestoneCobble(512, Material.rock).setUnlocalizedName("limestoneCobble");
        malachiteOre = new BlockMalachiteOre(513, Material.rock).setUnlocalizedName("malachiteOre");
        malachiteCobble = new BlockMalachiteCobble(514, Material.rock).setUnlocalizedName("malachiteCobble");
        coalOre = new BlockCoalOre(515, Material.rock).setUnlocalizedName("coalOre");
        coalCobble = new BlockCoalCobble(516, Material.rock).setUnlocalizedName("coalCobble");
        monaziteSand = new BlockMonaziteSand(517, Material.sand).setUnlocalizedName("monaziteSand");
        nativegoldOre = new BlockNativegoldOre(518, Material.rock).setUnlocalizedName("nativegoldOre");
        nativegoldCobble = new BlockNativegoldCobble(519, Material.rock).setUnlocalizedName("nativegoldCobble");
        sulfurOre = new BlockSulfurOre(520, Material.rock).setUnlocalizedName("sulfurOre");
        sulfurCobble = new BlockSulfurCobble(521, Material.rock).setUnlocalizedName("sulfurCobble");
        uraniniteOre = new BlockUraniniteOre(522, Material.rock).setUnlocalizedName("uraniniteOre");
        uraniniteCobble = new BlockUraniniteCobble(523, Material.rock).setUnlocalizedName("uraniniteCobble");
        GameRegistry.registerBlock(fertilizedBlock, ItemFertilizedBlock.class, modid + (fertilizedBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(tilledfertilizedBlock,
                                   ItemTilledfertilizedBlock.class,
                                   modid + (tilledfertilizedBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(squeeBlock, ItemSqueeBlock.class, modid + (squeeBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(bauxiteOre, ItemBauxiteCobble.class, modid + (bauxiteOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(cassititeriteOre, ItemCassititeriteCobble.class, modid + (cassititeriteOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(galenaOre, ItemGalenaCobble.class, modid + (galenaOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(hematiteOre, ItemHematiteCobble.class, modid + (hematiteOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(limestoneOre, ItemLimestoneCobble.class, modid + (limestoneOre.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(bauxiteCobble, ItemBauxiteCobble.class, modid + (bauxiteCobble.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(cassititeriteCobble, ItemCassititeriteCobble.class, modid
                                                                                       + (cassititeriteCobble.getUnlocalizedName().substring(5)));
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
        /*
         * for(int i = 0; i < Names.oreMetaBlock_name.length; i++) {
         * LanguageRegistry.addName(new ItemStack(OreMetaBlock, 1, i), Names.oreMetaBlock_name[i]);}
         */
        LanguageRegistry.addName(new ItemStack(fertilizedBlock, 1, 0), "Fertilized Block");
        LanguageRegistry.addName(new ItemStack(tilledfertilizedBlock, 1, 0), "Tilled Fertilized Block");
        LanguageRegistry.addName(new ItemStack(squeeBlock, 1, 0), "Squee Block");
        LanguageRegistry.addName(new ItemStack(bauxiteOre, 1, 0), "Bauxite Ore");
        LanguageRegistry.addName(new ItemStack(cassititeriteOre, 1, 0), "Cassititerite Ore");
        LanguageRegistry.addName(new ItemStack(galenaOre, 1, 0), "Galena Ore");
        LanguageRegistry.addName(new ItemStack(hematiteOre, 1, 0), "Hematite Ore");
        LanguageRegistry.addName(new ItemStack(limestoneOre, 1, 0), "Limestone Ore");
        LanguageRegistry.addName(new ItemStack(bauxiteCobble, 1, 0), "Bauxite Cobble");
        LanguageRegistry.addName(new ItemStack(cassititeriteCobble, 1, 0), "Cassititerite Cobble");
        LanguageRegistry.addName(new ItemStack(galenaCobble, 1, 0), "Galena Cobble");
        LanguageRegistry.addName(new ItemStack(hematiteCobble, 1, 0), "Hematite Cobble");
        LanguageRegistry.addName(new ItemStack(limestoneCobble, 1, 0), "Limestone Cobble");
        LanguageRegistry.addName(new ItemStack(malachiteOre, 1, 0), "Malachite Ore");
        LanguageRegistry.addName(new ItemStack(malachiteCobble, 1, 0), "Malachite Cobble");
        LanguageRegistry.addName(new ItemStack(coalOre, 1, 0), "Coal Ore");
        LanguageRegistry.addName(new ItemStack(coalCobble, 1, 0), "Coal Cobble");
        LanguageRegistry.addName(new ItemStack(monaziteSand, 1, 0), "Monazite Sand");
        LanguageRegistry.addName(new ItemStack(nativegoldOre, 1, 0), "Native Gold Ore");
        LanguageRegistry.addName(new ItemStack(nativegoldCobble, 1, 0), "Native Gold Cobble");
        LanguageRegistry.addName(new ItemStack(sulfurOre, 1, 0), "Sulfur Ore");
        LanguageRegistry.addName(new ItemStack(sulfurCobble, 1, 0), "Sulfur Cobble");
        LanguageRegistry.addName(new ItemStack(uraniniteOre, 1, 0), "Uraninite Ore");
        LanguageRegistry.addName(new ItemStack(uraniniteCobble, 1, 0), "Uraninite Cobble");
        squeeItem = new ItemSquee(5000).setUnlocalizedName("squeeItem");
        bauxiteItem = new ItemBauxite(5001).setUnlocalizedName("bauxiteCobble");
        cassititeriteItem = new ItemCassititerite(5002).setUnlocalizedName("cassititeriteCobble");
        galenaItem = new ItemGalena(5003).setUnlocalizedName("galenaCobble");
        hematiteItem = new ItemHematite(5004).setUnlocalizedName("hematiteCobble");
        limestoneItem = new ItemLimestone(5005).setUnlocalizedName("limestoneCobble");
        // hempSeeds = new ItemHempSeeds(5006, 1, 0).setUnlocalizedName("hempSeeds");
        LanguageRegistry.addName(squeeItem, "Squee Item");
        LanguageRegistry.addName(bauxiteItem, "Bauxite Cobble");
        LanguageRegistry.addName(cassititeriteItem, "Cassititerite Cobble");
        LanguageRegistry.addName(galenaItem, "Galena Cobble");
        LanguageRegistry.addName(hematiteItem, "Hematite Cobble");
        LanguageRegistry.addName(limestoneItem, "Limestone Cobble");
        // LanguageRegistry.addName(hempSeeds, "Hemp Seeds");
        GameRegistry.registerWorldGenerator(eventmanager);
    }
}