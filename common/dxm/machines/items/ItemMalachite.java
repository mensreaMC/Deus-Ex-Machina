package dxm.machines.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import dxm.machines.dxm;

public class ItemMalachite extends Item
{
    public ItemMalachite(int id)
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