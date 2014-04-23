package dxm.mod.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemFertilizedBlock extends ItemBlock {
    public ItemFertilizedBlock(int id) {
        super(id);
        setHasSubtypes(true);
    }
}