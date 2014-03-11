package dxm.machines.item.block;

import dxm.machines.Names;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class OreMetaBlockHandler extends ItemBlock {
    public OreMetaBlockHandler(int id) {
        super(id);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return Names.oreMetaBlock_unlocalizedName[itemstack.getItemDamage()];
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }
}