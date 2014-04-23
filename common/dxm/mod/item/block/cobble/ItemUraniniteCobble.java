package dxm.mod.item.block.cobble;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemUraniniteCobble extends ItemBlock {
    public ItemUraniniteCobble(int par1) {
        super(par1);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        String name = "";
        switch(itemstack.getItemDamage()) {
            case 0: {
                name = "world";
                break;
            }
            case 1: {
                name = "nether";
                break;
            }
            default:
                name = "broken";
        }
        return getUnlocalizedName() + "." + name;
    }

    @Override
    public int getMetadata(int par1) {
        return par1;
    }
}