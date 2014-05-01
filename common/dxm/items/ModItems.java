package dxm.items;

import dxm.DeusXMachina;
import dxm.utils.MinecraftHelper;
import dxm.utils.library.Archive;
import net.minecraft.item.Item;

public class ModItems {

    public static Item rebar;
    public static Item cotton;
    public static Item cottonSeeds;
    public static Item cottonBoles;
    public static Item cottonBundle;
    public static Item hempSeeds;
    public static Item hempBundle;
    public static Item switchgrassSeeds;
    public static Item switchgrassBundle;
    public static Item einkornSeeds;
    public static Item einkornBundle;
    public static Item einkornGrain;
    public static Item chaff;
    public static Item rubberSapling;
    public static Item flaxSeeds;
    public static Item flaxBundle;
    public static Item sugarcaneBundle;
    public static Item sugarcaneCuttings;

    public static void setup() {
        createItems();

        registerItems();
    }

    public static void createItems() {
        rebar = new Item().setUnlocalizedName("rebar").setTextureName(Archive.MOD_ID + ":rebar").setCreativeTab(DeusXMachina.instance.tab);
        cotton = new Item().setUnlocalizedName("cotton").setTextureName(Archive.MOD_ID + ":cotton").setCreativeTab(DeusXMachina.instance.tab);
        cottonSeeds = new Item().setUnlocalizedName("cottonSeeds").setTextureName(Archive.MOD_ID + ":cottonSeeds").setCreativeTab(DeusXMachina.instance.tab);
        cottonBoles = new Item().setUnlocalizedName("cottonBoles").setTextureName(Archive.MOD_ID + ":cottonBoles").setCreativeTab(DeusXMachina.instance.tab);
        cottonBundle = new Item().setUnlocalizedName("cottonBundle").setTextureName(Archive.MOD_ID + ":cottonBundle").setCreativeTab(DeusXMachina.instance.tab);
        hempSeeds = new Item().setUnlocalizedName("hempSeeds").setTextureName(Archive.MOD_ID + ":hempSeeds").setCreativeTab(DeusXMachina.instance.tab);
        hempBundle = new Item().setUnlocalizedName("hempBundle").setTextureName(Archive.MOD_ID + ":hempBundle").setCreativeTab(DeusXMachina.instance.tab);
        sugarcaneBundle = new Item().setUnlocalizedName("sugarcaneBundle").setTextureName(Archive.MOD_ID + ":sugarcaneBundle").setCreativeTab(DeusXMachina.instance.tab);
        sugarcaneCuttings = new Item().setUnlocalizedName("sugarcaneCuttings").setTextureName(Archive.MOD_ID + ":sugarcaneCuttings").setCreativeTab(DeusXMachina.instance.tab);
        switchgrassSeeds = new Item().setUnlocalizedName("switchgrassSeeds").setTextureName(Archive.MOD_ID + ":switchgrassSeeds").setCreativeTab(DeusXMachina.instance.tab);
        switchgrassBundle = new Item().setUnlocalizedName("switchgrassBundle").setTextureName(Archive.MOD_ID + ":switchgrassBundle").setCreativeTab(DeusXMachina.instance.tab);
        chaff = new Item().setUnlocalizedName("chaff").setTextureName(Archive.MOD_ID + ":chaff").setCreativeTab(DeusXMachina.instance.tab);
        einkornGrain = new Item().setUnlocalizedName("einkornGrain").setTextureName(Archive.MOD_ID + ":einkornGrain").setCreativeTab(DeusXMachina.instance.tab);
        einkornSeeds = new Item().setUnlocalizedName("einkornSeeds").setTextureName(Archive.MOD_ID + ":einkornSeeds").setCreativeTab(DeusXMachina.instance.tab);
        einkornBundle = new Item().setUnlocalizedName("einkornBundle").setTextureName(Archive.MOD_ID + ":einkornBundle").setCreativeTab(DeusXMachina.instance.tab);
        rubberSapling = new Item().setUnlocalizedName("rubberSapling").setTextureName(Archive.MOD_ID + ":rubberSapling").setCreativeTab(DeusXMachina.instance.tab);
        flaxSeeds = new Item().setUnlocalizedName("flaxSeeds").setTextureName(Archive.MOD_ID + ":flaxSeeds").setCreativeTab(DeusXMachina.instance.tab);
        flaxBundle = new Item().setUnlocalizedName("flaxBundle").setTextureName(Archive.MOD_ID + ":flaxBundle").setCreativeTab(DeusXMachina.instance.tab);
    }

    public static void registerItems() {
        MinecraftHelper.registerItem(rebar);
        MinecraftHelper.registerItem(chaff);
        MinecraftHelper.registerItem(cotton);
        MinecraftHelper.registerItem(cottonSeeds);
        MinecraftHelper.registerItem(cottonBoles);
        MinecraftHelper.registerItem(cottonBundle);
        MinecraftHelper.registerItem(hempSeeds);
        MinecraftHelper.registerItem(hempBundle);
        MinecraftHelper.registerItem(sugarcaneBundle);
        MinecraftHelper.registerItem(sugarcaneCuttings);
        MinecraftHelper.registerItem(switchgrassSeeds);
        MinecraftHelper.registerItem(switchgrassBundle);
        MinecraftHelper.registerItem(einkornSeeds);
        MinecraftHelper.registerItem(einkornGrain);
        MinecraftHelper.registerItem(einkornBundle);
        MinecraftHelper.registerItem(rubberSapling);
        MinecraftHelper.registerItem(flaxSeeds);
        MinecraftHelper.registerItem(flaxBundle);
    }
}