package dxm.machines.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import dxm.machines.dxm;

public class ItemHematite extends Item
{
    public ItemHematite(int id)
    {
        super(id);
        setHasSubtypes(true);
        setCreativeTab(CreativeTabs.tabMaterials);
    }

    public String getUnlocalizedNames(ItemStack itemstack)
    {
        String name = "";
        switch (itemstack.getItemDamage())
        {
            case 0:
            {
                name = "world";
                break;
            }
            case 1:
            {
                name = "nether";
                break;
            }
            default:
                name = "broken";
        }
        return getUnlocalizedName() + "." + name;
    }

    @Override
    public int getMetadata(int par1)
    {
        return par1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        itemIcon = par1IconRegister.registerIcon(dxm.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
}