package dxm.machines.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import java.util.List;

// TODO follow dated tutorial

public class MultiBlock extends Block {
    public MultiBlock(int id) {
        super(id, Material.ground);
        setUnlocalizedName("multiBlock");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public Icon getIcon(int par1, int par2) {
        // TODO Auto-generated method stub
        return super.getIcon(par1, par2);
    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
        for(int ix = 0; ix < 16; ix++) {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }
}