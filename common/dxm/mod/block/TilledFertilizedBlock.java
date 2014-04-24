package dxm.mod.block;

import dxm.blocks.ModBlocks;
import net.minecraft.item.Item;

import java.util.Random;

public class TilledFertilizedBlock extends FertilizedBlock {
    public TilledFertilizedBlock() {
        super();
        setBlockName("tilledFertilizedBlock");
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(ModBlocks.fertilizedBlock);
    }
}