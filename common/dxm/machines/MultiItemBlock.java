package dxm.machines;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class MultiItemBlock extends ItemBlock
{
    private final static String[] subNames = { "white",
                                              "orange",
                                              "magenta",
                                              "lightBlue",
                                              "yellow",
                                              "lightGreen",
                                              "pink",
                                              "darkGrey",
                                              "lightGrey",
                                              "cyan",
                                              "purple",
                                              "blue",
                                              "brown",
                                              "green",
                                              "red",
                                              "black" };

    public MultiItemBlock(int id)
    {
        super(id);
        setHasSubtypes(true);
        setTextureName("multiBlock"); // was set item name
    }

    @Override
    public int getMetadata(int damageValue)
    {
        return damageValue;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        return getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
    }
}