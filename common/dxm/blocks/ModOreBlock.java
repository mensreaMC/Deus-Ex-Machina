package dxm.blocks;


import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import java.util.Random;

public class ModOreBlock extends BlockOre {

    MaterialTypes type;

    public ModOreBlock(MaterialTypes type) {
        this.type = type;
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortue) {
        return Item.getItemFromBlock(type.getCobble());
    }
}