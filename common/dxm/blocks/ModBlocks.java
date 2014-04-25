package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static Block fertilizedBlock;
    public static Block tilledFertilizedBlock;
    public static Block monaziteSand;

    public static void setup() {
        MaterialTypes.setup();
        fertilizedBlock = new ModBlock(Material.ground).setBlockName("fertilizedBlock").setBlockTextureName(Archive.MOD_ID + ":bio/fertilizedBlock").setHardness(4).setStepSound(Block.soundTypeGrass).setCreativeTab(DeusXMachina.instance.tab);
        tilledFertilizedBlock = new TilledFertilizedBlock();
        monaziteSand = new BlockFalling().setBlockName("monaziteSand").setBlockTextureName(Archive.MOD_ID + ":ore/monaziteSand").setHardness(4).setStepSound(Block.soundTypeSand).setCreativeTab(DeusXMachina.instance.tab);

        GameRegistry.registerBlock(fertilizedBlock, fertilizedBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(tilledFertilizedBlock, tilledFertilizedBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(monaziteSand, monaziteSand.getUnlocalizedName().replace("tile", Archive.MOD_ID));
    }
}