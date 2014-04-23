package dxm.mod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dxm.mod.dxm;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import java.util.List;
import java.util.Random;

public class BlockTilledfertilizedBlock extends Block {
    public BlockTilledfertilizedBlock(int id, Material rock) {
        super(id, rock);
        setHardness(4.0F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName("tilledfertilizedBlock");
        setCreativeTab(CreativeTabs.tabBlock);
        setCreativeTab(CreativeTabs.tabBlock);
    }

    public int getBlockTextureFromSideAndMetadata(int par1, int par2) {
        switch(par2) {
            case 0:
                return 0;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override
    public int damageDropped(int rock) {
        return rock;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return dxm.fertilizedBlock.blockID;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random par1Random) {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        icons = new Icon[5];
        for(int i = 0; i < icons.length; i++) {
            icons[i] = par1IconRegister.registerIcon(dxm.modid + ":" + (getUnlocalizedName().substring(5)) + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
        switch(par2) {
            case 0:
                return icons[0];
            case 1: {
                switch(par1) {
                    case 0:
                        return icons[1];
                    case 1:
                        return icons[2];
                    default:
                        return icons[3];
                }
            }
            default: {
                System.out.println("Invalid metadata for" + getUnlocalizedName());
                return icons[0];
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
        for(int i = 0; i < 2; i++) {
            par3List.add(new ItemStack(par1, 1, i));
        }
    }
}
