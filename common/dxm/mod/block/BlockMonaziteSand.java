package dxm.mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMonaziteSand extends BlockSand {
    public BlockMonaziteSand() {
        setHardness(4.0F);
        setStepSound(Block.soundTypeSand);
        setBlockName("monaziteSand");
        setCreativeTab(CreativeTabs.tabBlock);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
