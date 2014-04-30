package dxm.items;

import dxm.DeusXMachina;
import dxm.utils.MinecraftHelper;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModItems {

    public static Item rebar;
    public static Item cottonSeeds;
    public static Item cottonBole;
    public static Item cottonBundle;
    public static Item hempSeeds;
    public static Item hempBundle;
    public static Item switchgrassSeeds;
    public static Item switchgrassBundle;
    public static Item einkornSeeds;
    public static Item einkornBundle;
    public static Item rubberSapling;
    public static Item flaxSeeds;
    public static Item flaxBundle;
	public static Item sugarcaneBundle;
    
    public static void setup() {
   
    	rebar = new Item().setUnlocalizedName("rebar").setTextureName(Archive.MOD_ID + ":rebar").setCreativeTab(DeusXMachina.instance.tab);
    	cottonSeeds = new Item().setUnlocalizedName("cottonSeeds").setTextureName(Archive.MOD_ID + ":cottonSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	cottonBole = new Item().setUnlocalizedName("cottonBole").setTextureName(Archive.MOD_ID + ":cottonBole").setCreativeTab(DeusXMachina.instance.tab);
    	cottonBundle = new Item().setUnlocalizedName("cottonBundle").setTextureName(Archive.MOD_ID + ":cottonBundle").setCreativeTab(DeusXMachina.instance.tab);
    	hempSeeds = new Item().setUnlocalizedName("hempSeeds").setTextureName(Archive.MOD_ID + ":hempSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	hempBundle = new Item().setUnlocalizedName("hemp").setTextureName(Archive.MOD_ID + ":hempBundle").setCreativeTab(DeusXMachina.instance.tab);
    	sugarcaneBundle = new Item().setUnlocalizedName("sugarcaneBundle").setTextureName(Archive.MOD_ID + ":sugarcaneBundle").setCreativeTab(DeusXMachina.instance.tab);
    	switchgrassSeeds = new Item().setUnlocalizedName("switchgrassSeeds").setTextureName(Archive.MOD_ID + ":switchgrassSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	switchgrassBundle = new Item().setUnlocalizedName("switchgrass").setTextureName(Archive.MOD_ID + ":switchgrassBundle").setCreativeTab(DeusXMachina.instance.tab);
    	einkornSeeds = new Item().setUnlocalizedName("aestivumSeeds").setTextureName(Archive.MOD_ID + ":einkornSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	einkornBundle = new Item().setUnlocalizedName("aestivum").setTextureName(Archive.MOD_ID + ":einkornBundle").setCreativeTab(DeusXMachina.instance.tab);
    	rubberSapling = new Item().setUnlocalizedName("rubberSapling").setTextureName(Archive.MOD_ID + ":rubberSapling").setCreativeTab(DeusXMachina.instance.tab);
    	flaxSeeds = new Item().setUnlocalizedName("flaxSeeds").setTextureName(Archive.MOD_ID + ":flaxSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	flaxBundle = new Item().setUnlocalizedName("flax").setTextureName(Archive.MOD_ID + ":flaxBundle").setCreativeTab(DeusXMachina.instance.tab);
    	
    	MinecraftHelper.registerItem(rebar);
        MinecraftHelper.registerItem(cottonSeeds);
        MinecraftHelper.registerItem(cottonBole);
        MinecraftHelper.registerItem(cottonBundle);
        MinecraftHelper.registerItem(hempSeeds);
        MinecraftHelper.registerItem(hempBundle);
        MinecraftHelper.registerItem(sugarcaneBundle);
        MinecraftHelper.registerItem(switchgrassSeeds);
        MinecraftHelper.registerItem(switchgrassBundle);
        MinecraftHelper.registerItem(einkornSeeds);
        MinecraftHelper.registerItem(einkornBundle);
        MinecraftHelper.registerItem(rubberSapling);
        MinecraftHelper.registerItem(flaxSeeds);
        MinecraftHelper.registerItem(flaxBundle);

    }
}
