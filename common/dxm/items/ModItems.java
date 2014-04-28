package dxm.items;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.item.Item;

public class ModItems {

	public static Item squee;
    public static Item rebar;

    public static void setup() {
        squee = new Item().setUnlocalizedName("squee").setTextureName(Archive.MOD_ID + ":squee").setCreativeTab(DeusXMachina.instance.tab);
        rebar = new Item().setUnlocalizedName("rebar").setTextureName(Archive.MOD_ID + ":rebar").setCreativeTab(DeusXMachina.instance.tab);

        GameRegistry.registerItem(squee, squee.getUnlocalizedName().replace("item", Archive.MOD_ID));
        GameRegistry.registerItem(rebar, rebar.getUnlocalizedName().replace("item", Archive.MOD_ID));
    }
}
