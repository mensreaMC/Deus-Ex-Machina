package dxm.machines;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
// TODO follow dated tutorial
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MultiBlock extends Block
{
    public MultiBlock(int id)
    {
        super(id, Material.ground);
        setUnlocalizedName("multiBlock");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public Icon getIcon(int par1, int par2)
    {
        // TODO Auto-generated method stub
        return super.getIcon(par1, par2);
    }

    @Override
    public int damageDropped(int metadata)
    {
        return metadata;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs tab, List subItems)
    {
        for (int ix = 0; ix < 16; ix++)
        {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }
}