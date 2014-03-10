package dxm.machines.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import dxm.machines.dxm;

public class ItemOres extends Item
{
    public ItemOres(int id)
    {
        super(id);
        setCreativeTab(CreativeTabs.tabMaterials);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        itemIcon = par1IconRegister.registerIcon(dxm.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}