package dxm.machines.block.cobble;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import dxm.machines.dxm;

public class BlockCoalCobble extends BlockOre
{
    public BlockCoalCobble(int id, Material rock)
    {
        super(id);
        setHardness(4.0F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName("coalCobble");
        setCreativeTab(CreativeTabs.tabBlock);
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public int damageDropped(int rock)
    {
        return rock;
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        icons = new Icon[4];
        for (int i = 0; i < icons.length; i++)
        {
            icons[i] = par1IconRegister.registerIcon(dxm.modid + ":" + (getUnlocalizedName().substring(5)) + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        switch (par2)
        {
            case 0:
                return icons[0];
            case 1:
            {
                switch (par1)
                {
                    case 0:
                        return icons[1];
                    case 1:
                        return icons[2];
                    default:
                        return icons[3];
                }
            }
            default:
            {
                System.out.println("Invalid metadata for" + getUnlocalizedName());
                return icons[0];
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int i = 0; i < 2; i++)
        {
            par3List.add(new ItemStack(par1, 1, i));
        }
    }
}
