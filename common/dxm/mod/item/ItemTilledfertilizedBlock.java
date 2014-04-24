package dxm.mod.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemTilledfertilizedBlock extends ItemBlock {
    public ItemTilledfertilizedBlock(Block b) {
        super(b);
        setHasSubtypes(true);
    }
}