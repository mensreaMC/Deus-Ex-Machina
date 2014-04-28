package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.MinecraftHelper;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static Block aestivumZero;
    public static Block aestivumOne;
    public static Block aestivumTwo;
    public static Block aestivumThree;
    public static Block asphaltBlock;
    public static Block adminConcreteBlock;
    public static Block adminAsphaltBlock;
    public static Block concreteBlock;
    public static Block concreteCobble;
    public static Block cottonZero;
    public static Block cottonOne;
    public static Block cottonTwo;
    public static Block cottonThree;
    public static Block fertilizedBlock;
    public static Block flaxZero;
    public static Block flaxOne;
    public static Block flaxTwo;
    public static Block flaxThree;
    public static Block geoActive;
    public static Block geoGas;
    public static Block geoHeavy;
    public static Block geoLight;
    public static Block geoShale;
    public static Block hempZero;
    public static Block hempOne;
    public static Block hempTwo;
    public static Block hempThree;
    public static Block monaziteSand;
    public static Block mudBrick;
    public static Block reConcreteBlock;
    public static Block rubberLeaf;
    public static Block rubberLog;
    public static Block sugarCane;
    public static Block switchgrassZero;
    public static Block switchgrassOne;
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
        geoActive = new ModBlockTopTexture(Material.ground).setBlockName("geoActive").setBlockTextureName(Archive.MOD_ID + ":geo/geoActive").setHardness(999).setResistance(999).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        geoGas = new ModBlockTopTexture(Material.ground).setBlockName("geoGas").setBlockTextureName(Archive.MOD_ID + ":geo/geoGas").setHardness(999).setResistance(999).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        geoHeavy = new ModBlockTopTexture(Material.ground).setBlockName("geoHeavy").setBlockTextureName(Archive.MOD_ID + ":geo/geoHeavy").setHardness(999).setResistance(999).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        geoLight = new ModBlockTopTexture(Material.ground).setBlockName("geoLight").setBlockTextureName(Archive.MOD_ID + ":geo/geoLight").setHardness(999).setResistance(999).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        geoShale = new ModBlock(Material.ground).setBlockName("geoShale").setBlockTextureName(Archive.MOD_ID + ":geo/geoShale").setHardness(999).setResistance(999).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        monaziteSand = new BlockFalling().setBlockName("monaziteSand").setBlockTextureName(Archive.MOD_ID + ":ore/monaziteSand").setHardness(4).setStepSound(Block.soundTypeSand).setCreativeTab(DeusXMachina.instance.tab);
        mudBrick = new ModBlock(Material.ground).setBlockName("mudBrick").setBlockTextureName(Archive.MOD_ID + ":fab/mudBrick").setHardness(1).setResistance(2).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        reConcreteBlock = new ReConcreteBlock();
        rubberLeaf = new ModBlock(Material.ground).setBlockName("rubberLeaf").setBlockTextureName(Archive.MOD_ID + ":bio/rubberLeaf").setHardness(1).setResistance(1).setStepSound(Block.soundTypeGrass).setCreativeTab(DeusXMachina.instance.tab);
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