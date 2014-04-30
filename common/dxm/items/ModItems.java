package dxm.items;

import dxm.DeusXMachina;
import dxm.utils.MinecraftHelper;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModItems {

    public static Item rebar;
    public static Item cottonSeed;
    public static Item cottonBole;
    public static Item cottonBundle;
    public static Item hempSeed;
    public static Item hempBundle;
    public static Item switchgrassSeed;
    public static Item switchgrassBundle;
    public static Item einkornSeed;
    public static Item einkornBundle;
    public static Item rubberSapling;
    public static Item flaxSeeds;
    public static Item flaxBundle;
	public static Item sugarcaneBundle;
    
    public static void setup() {
   
    	rebar = new Item().setUnlocalizedName("rebar").setTextureName(Archive.MOD_ID + ":rebar").setCreativeTab(DeusXMachina.instance.tab);
    	cottonSeed = new Item().setUnlocalizedName("cottonSeeds").setTextureName(Archive.MOD_ID + ":cottonSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	cottonBole = new Item().setUnlocalizedName("cottonBole").setTextureName(Archive.MOD_ID + ":cottonBole").setCreativeTab(DeusXMachina.instance.tab);
    	cottonBundle = new Item().setUnlocalizedName("cottonBole").setTextureName(Archive.MOD_ID + ":cottonBundle").setCreativeTab(DeusXMachina.instance.tab);
    	hempSeed = new Item().setUnlocalizedName("hempSeeds").setTextureName(Archive.MOD_ID + ":hempSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	hempBundle = new Item().setUnlocalizedName("hemp").setTextureName(Archive.MOD_ID + ":hempBundle").setCreativeTab(DeusXMachina.instance.tab);
    	sugarcaneBundle = new Item().setUnlocalizedName("sugarcaneBundle").setTextureName(Archive.MOD_ID + ":sugarcaneBundle").setCreativeTab(DeusXMachina.instance.tab);
    	switchgrassSeed = new Item().setUnlocalizedName("switchgrassSeeds").setTextureName(Archive.MOD_ID + ":switchgrassSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	switchgrassBundle = new Item().setUnlocalizedName("switchgrass").setTextureName(Archive.MOD_ID + ":switchgrassBundle").setCreativeTab(DeusXMachina.instance.tab);
    	einkornSeed = new Item().setUnlocalizedName("aestivumSeeds").setTextureName(Archive.MOD_ID + ":einkornSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	einkornBundle = new Item().setUnlocalizedName("aestivum").setTextureName(Archive.MOD_ID + ":einkornBundle").setCreativeTab(DeusXMachina.instance.tab);
    	rubberSapling = new Item().setUnlocalizedName("rubberSapling").setTextureName(Archive.MOD_ID + ":rubberSapling").setCreativeTab(DeusXMachina.instance.tab);
    	flaxSeeds = new Item().setUnlocalizedName("flaxSeeds").setTextureName(Archive.MOD_ID + ":flaxSeeds").setCreativeTab(DeusXMachina.instance.tab);
    	flaxBundle = new Item().setUnlocalizedName("flax").setTextureName(Archive.MOD_ID + ":flaxBundle").setCreativeTab(DeusXMachina.instance.tab);
    	
    	MinecraftHelper.registerItem(rebar);
        MinecraftHelper.registerItem(cottonSeed);
        MinecraftHelper.registerItem(cottonBole);
        MinecraftHelper.registerItem(cottonBundle);
        MinecraftHelper.registerItem(hempSeed);
        MinecraftHelper.registerItem(hempBundle);
        MinecraftHelper.registerItem(sugarcaneBundle);
        MinecraftHelper.registerItem(switchgrassSeed);
        MinecraftHelper.registerItem(switchgrassBundle);
        MinecraftHelper.registerItem(einkornSeed);
        MinecraftHelper.registerItem(einkornBundle);
        MinecraftHelper.registerItem(rubberSapling);
        MinecraftHelper.registerItem(flaxSeeds);
        MinecraftHelper.registerItem(flaxBundle);

    }
}
