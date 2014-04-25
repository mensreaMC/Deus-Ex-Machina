package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMonaziteSand extends BlockSand {
    public BlockMonaziteSand() {
        setHardness(4.0F);
        setStepSound(Block.soundTypeSand);
        setBlockName("monaziteSand");
        setBlockTextureName(Archive.MOD_ID + ":bio/monaziteSand");
        setCreativeTab(DeusXMachina.instance.tab);
    }
}
