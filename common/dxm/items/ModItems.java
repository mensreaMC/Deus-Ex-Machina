package dxm.items;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.item.Item;

public class ModItems {

    public static Item squee;

    public static void setup() {
        squee = new Item().setUnlocalizedName("squee").setTextureName(Archive.MOD_ID + ":squee").setCreativeTab(DeusXMachina.instance.tab);

        GameRegistry.registerItem(squee, squee.getUnlocalizedName().replace("item", Archive.MOD_ID));
    }
}
