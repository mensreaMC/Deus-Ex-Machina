package dxm.blocks;

import dxm.mod.block.FertilizedBlock;
import dxm.mod.block.BlockMonaziteSand;
import dxm.mod.block.TilledFertilizedBlock;
import net.minecraft.block.Block;

public class ModBlocks {

    public static Block fertilizedBlock;
    public static Block tilledFertilizedBlock;
    public static Block monaziteSand;

    public static void setup() {
        MaterialTypes.setup();
        monaziteSand = new BlockMonaziteSand();
        fertilizedBlock = new FertilizedBlock();
        tilledFertilizedBlock = new TilledFertilizedBlock();

        //GameRegistry.registerBlock(fertilizedBlock, ItemFertilizedBlock.class, modid + (fertilizedBlock.getUnlocalizedName().substring(5)));
        //GameRegistry.registerBlock(tilledFertilizedBlock, ItemTilledfertilizedBlock.class, modid + (tilledFertilizedBlock.getUnlocalizedName().substring(5)));
        //GameRegistry.registerBlock(monaziteSand, ItemMonaziteSand.class, modid + (monaziteSand.getUnlocalizedName().substring(5)));
    }
}