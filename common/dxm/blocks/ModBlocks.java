package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;

public class ModBlocks {

    public static Block fertilizedBlock;
    public static Block tilledFertilizedBlock;
    public static Block monaziteSand;

    public static void setup() {
        MaterialTypes.setup();
        fertilizedBlock = new FertilizedBlock();
        tilledFertilizedBlock = new TilledFertilizedBlock();
        monaziteSand = new BlockFalling().setBlockName("monaziteSand").setBlockTextureName(Archive.MOD_ID + ":ore/monaziteSand").setHardness(4).setStepSound(Block.soundTypeSand).setCreativeTab(DeusXMachina.instance.tab);

        GameRegistry.registerBlock(fertilizedBlock, Archive.MOD_ID + (fertilizedBlock.getUnlocalizedName().replace("tile", "")));
        GameRegistry.registerBlock(tilledFertilizedBlock, Archive.MOD_ID + (tilledFertilizedBlock.getUnlocalizedName().replace("tile", "")));
        GameRegistry.registerBlock(monaziteSand, Archive.MOD_ID + (monaziteSand.getUnlocalizedName().replace("tile", "")));
    }
}