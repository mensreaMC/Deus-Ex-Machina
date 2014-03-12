package dxm.machines;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class dxmCrafting {
    public static void addRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(dxm.squeeBlock), new Object[]{new ItemStack(Item.diamond),
                new ItemStack(Block.stone),
                new ItemStack(Item.dyePowder, 1, 15)});
        GameRegistry.addRecipe(new ItemStack(dxm.squeeBlock), new Object[]{"XZX",
                "XZX",
                "CXC",
                'X',
                Item.ingotGold,
                'C',
                Block.stone,
                'Z',
                new ItemStack(Item.dyePowder, 1, 15)});
        ItemStack enchanted = new ItemStack(Item.pickaxeStone);
        enchanted.addEnchantment(Enchantment.sharpness, 2);
        GameRegistry.addShapelessRecipe(enchanted, new Object[]{new ItemStack(Item.pickaxeStone),
                new ItemStack(Item.flint),
                new ItemStack(dxm.squeeBlock)});
        FurnaceRecipes.smelting().addSmelting(Item.beefCooked.itemID, 0, new ItemStack(dxm.squeeItem), 0.1F);
    }
}