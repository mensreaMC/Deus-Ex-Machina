package dxm.utils;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MinecraftHelper {

    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, StringHelper.cleanUnlocalizedBlockName(block));
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock) {
        GameRegistry.registerBlock(block, itemBlock, StringHelper.cleanUnlocalizedBlockName(block));
    }

    public static void registerItem(Item item) {
        GameRegistry.registerItem(item, StringHelper.cleanUnlocalizedItemName(item));
    }
}