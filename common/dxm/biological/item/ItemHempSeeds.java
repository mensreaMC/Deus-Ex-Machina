package dxm.biological.item;

import dxm.biological.BioSpawnMain;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class ItemHempSeeds extends ItemSeeds {
    public ItemHempSeeds(int id, int type, int growthID) {
        super(id, type, growthID);
        setTextureName("/mensrea_dxm/textures/items/hempSeed.png");
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("hempSeed");
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(BioSpawnMain.modID + ":" + this.getUnlocalizedName());
    }
}