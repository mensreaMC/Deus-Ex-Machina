package dxm.blocks;

import net.minecraft.block.Block;

public class ModBlocks {

    public static Block fertilizedBlock;
    public static Block tilledfertilizedBlock;
    public static Block monaziteSand;

    public static int ID = 500;

    public static void setup() {

        //monaziteSand = new BlockMonaziteSand(517, Material.sand).setUnlocalizedName("monaziteSand").setCreativeTab(tab);
        //fertilizedBlock = new BlockFertilizedBlock(524, Material.rock).setUnlocalizedName("fertilizedBlock").setCreativeTab(tab);
        //tilledfertilizedBlock = new BlockTilledfertilizedBlock(525, Material.rock).setUnlocalizedName("tilledfertilizedBlock").setCreativeTab(tab);

        //GameRegistry.registerBlock(fertilizedBlock, ItemFertilizedBlock.class, modid + (fertilizedBlock.getUnlocalizedName().substring(5)));
        //GameRegistry.registerBlock(tilledfertilizedBlock, ItemTilledfertilizedBlock.class, modid + (tilledfertilizedBlock.getUnlocalizedName().substring(5)));
        //GameRegistry.registerBlock(monaziteSand, ItemMonaziteSand.class, modid + (monaziteSand.getUnlocalizedName().substring(5)));
    }
}