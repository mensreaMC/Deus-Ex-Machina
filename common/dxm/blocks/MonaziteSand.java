package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockSand;
import net.minecraft.creativetab.CreativeTabs;

public class MonaziteSand extends BlockFalling {
    public MonaziteSand() {
        setHardness(4.0F);
        setStepSound(Block.soundTypeSand);
        setBlockName("monaziteSand");
        setBlockTextureName(Archive.MOD_ID + ":ore/monaziteSand");
        setCreativeTab(DeusXMachina.instance.tab);
    }
}
