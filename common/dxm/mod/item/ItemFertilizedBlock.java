package dxm.mod.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemFertilizedBlock extends ItemBlock {
    public ItemFertilizedBlock(Block b) {
        super(b);
        setHasSubtypes(true);
    }
}