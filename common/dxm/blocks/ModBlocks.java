package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;

public class ModBlocks {

    public static Block fertilizedBlock;
    public static Block tilledFertilizedBlock;
    public static Block monaziteSand;

    public static void setup() {
        MaterialTypes.setup();
        monaziteSand = new MonaziteSand();
        fertilizedBlock = new FertilizedBlock();
        tilledFertilizedBlock = new TilledFertilizedBlock();

        GameRegistry.registerBlock(fertilizedBlock, Archive.MOD_ID + (fertilizedBlock.getUnlocalizedName().replace("tile", "")));
        GameRegistry.registerBlock(tilledFertilizedBlock, Archive.MOD_ID + (tilledFertilizedBlock.getUnlocalizedName().replace("tile","")));
        GameRegistry.registerBlock(monaziteSand, Archive.MOD_ID + (monaziteSand.getUnlocalizedName().replace("tile", "")));
    }
}