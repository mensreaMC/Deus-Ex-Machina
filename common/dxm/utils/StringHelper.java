package dxm.utils;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class StringHelper {

    public static String cleanUnlocalizedBlockName(Block b) {
        return b.getUnlocalizedName().replace("tile.", "");
    }

    public static String cleanUnlocalizedItemName(Item i) {
        return i.getUnlocalizedName().replace("item.", "");
    }
}