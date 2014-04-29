package dxm.items;

import dxm.DeusXMachina;
import dxm.utils.MinecraftHelper;
import dxm.utils.library.Archive;
import net.minecraft.item.Item;

public class ModItems {

    public static Item squee;
    public static Item rebar;
    public static Item cottonSeed;
    public static Item cottonBole;
    public static Item hempSeed;
    public static Item hemp;
    public static Item switchgrassSeed;
    public static Item switchgrass;
    public static Item aestivumSeed;
    public static Item rubberSapling;
    public static Item flaxSeeds;
    
    public static void setup() {
        squee = new Item().setUnlocalizedName("squee").setTextureName(Archive.MOD_ID + ":squee").setCreativeTab(DeusXMachina.instance.tab);
        rebar = new Item().setUnlocalizedName("rebar").setTextureName(Archive.MOD_ID + ":rebar").setCreativeTab(DeusXMachina.instance.tab);

        MinecraftHelper.registerItem(squee);
        MinecraftHelper.registerItem(rebar);
    }
}
