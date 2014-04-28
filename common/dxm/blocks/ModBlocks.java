package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.MinecraftHelper;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static Block adminConcreteBlock;
    public static Block adminAsphaltBlock;
    public static Block asphaltBlock;
    public static Block concreteCobble;
    public static Block concreteBlock;
    public static Block fertilizedBlock;
    public static Block geoActive;
    public static Block geoGas;
    public static Block geoHeavy;
    public static Block geoLight;
    public static Block geoShale;
    public static Block monaziteSand;
    public static Block mudBrick;
    public static Block reConcreteBlock;
    public static Block rubberLeaf;
    public static Block rubberLog;
    public static Block tilledFertilizedBlock;

    public static void setup() {
        MaterialTypes.setup();

        createBlocks();

        registerBlocks();
    }

    private static void createBlocks() {
        adminAsphaltBlock = new ModBlock(Material.ground).setBlockName("adminAsphaltBlock").setBlockTextureName(Archive.MOD_ID + ":fab/asphaltBlock").setHardness(999).setResistance(999).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        asphaltBlock = new ModBlock(Material.ground).setBlockName("asphaltBlock").setBlockTextureName(Archive.MOD_ID + ":fab/asphaltBlock").setHardness(1).setResistance(10).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        adminConcreteBlock = new ModBlock(Material.ground).setBlockName("adminConcreteBlock").setBlockTextureName(Archive.MOD_ID + ":fab/concreteBlock").setHardness(999).setResistance(999).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        concreteBlock = new ConcreteBlock();
        concreteCobble = new ModBlock(Material.ground).setBlockName("concreteCobble").setBlockTextureName(Archive.MOD_ID + ":fab/concreteCobble").setHardness(4).setResistance(10).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        fertilizedBlock = new ModBlock(Material.ground).setBlockName("fertilizedBlock").setBlockTextureName(Archive.MOD_ID + ":bio/fertilizedBlock").setHardness(4).setResistance(10).setStepSound(Block.soundTypeGrass).setCreativeTab(DeusXMachina.instance.tab);
        geoActive = new GeoActive();
        geoGas = new GeoGas();
        geoHeavy = new GeoHeavy();
        geoLight = new GeoLight();
        geoShale = new ModBlock(Material.ground).setBlockName("geoShale").setBlockTextureName(Archive.MOD_ID + ":geo/geoShale").setHardness(999).setResistance(999).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        monaziteSand = new BlockFalling().setBlockName("monaziteSand").setBlockTextureName(Archive.MOD_ID + ":ore/monaziteSand").setHardness(4).setStepSound(Block.soundTypeSand).setCreativeTab(DeusXMachina.instance.tab);
        mudBrick = new ModBlock(Material.ground).setBlockName("mudBrick").setBlockTextureName(Archive.MOD_ID + ":fab/mudBrick").setHardness(1).setResistance(2).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        reConcreteBlock = new ReConcreteBlock();
        rubberLeaf = new RubberLeaf();
        rubberLog = new RubberLog();
        tilledFertilizedBlock = new TilledFertilizedBlock();
    }

    private static void registerBlocks() {
        MinecraftHelper.registerBlock(adminAsphaltBlock);
        MinecraftHelper.registerBlock(asphaltBlock);
        MinecraftHelper.registerBlock(adminConcreteBlock);
        MinecraftHelper.registerBlock(concreteCobble);
        MinecraftHelper.registerBlock(concreteBlock);
        MinecraftHelper.registerBlock(fertilizedBlock);
        MinecraftHelper.registerBlock(monaziteSand);
        MinecraftHelper.registerBlock(geoActive);
        MinecraftHelper.registerBlock(geoGas);
        MinecraftHelper.registerBlock(geoHeavy);
        MinecraftHelper.registerBlock(geoLight);
        MinecraftHelper.registerBlock(geoShale);
        MinecraftHelper.registerBlock(mudBrick);
        MinecraftHelper.registerBlock(reConcreteBlock);
        MinecraftHelper.registerBlock(rubberLeaf);
        MinecraftHelper.registerBlock(rubberLog);
        MinecraftHelper.registerBlock(tilledFertilizedBlock);
    }
}