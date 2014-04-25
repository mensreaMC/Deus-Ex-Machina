package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FertilizedBlock extends Block {
    public FertilizedBlock() {
        super(Material.ground);
        setHardness(4.0F);
        setStepSound(Block.soundTypeStone);
        setBlockName("fertilizedBlock");
        setBlockTextureName(Archive.MOD_ID + ":bio/fertilizedBlock");
        setCreativeTab(DeusXMachina.instance.tab);
    }
}