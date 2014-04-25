package dxm.blocks;

import dxm.utils.library.Archive;
import net.minecraft.item.Item;

import java.util.Random;

public class TilledFertilizedBlock extends FertilizedBlock {
    public TilledFertilizedBlock() {
        super();
        setBlockName("tilledFertilizedBlock");
        setBlockTextureName(Archive.MOD_ID + ":bio/tilledFertilizedBlock");
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(ModBlocks.fertilizedBlock);
    }
}