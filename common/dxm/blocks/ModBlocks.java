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
    public static Block concreteBlock;
    public static Block concreteCobble;
    public static Block cottonZero;
    public static Block cottonOne;
    public static Block cottonTwo;
    public static Block cottonThree;
    public static Block einkornZero;
    public static Block einkornOne;
    public static Block einkornTwo;
    public static Block einkornThree;
    public static Block enormousLeaf;
    public static Block enormousLog;
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
    public static Block sugarcaneZero;
    public static Block sugarcaneOne;
    public static Block sugarcaneTwo;
    public static Block switchgrassZero;
    public static Block switchgrassOne;
    public static Block switchgrassTwo;
    public static Block tilledFertilizedBlock;

    public static void setup() {
        MaterialTypes.setup();

        createBlocks();

        registerBlocks();
    }

    private static void createBlocks() {
        adminAsphaltBlock = new ModBlock(Material.ground).setBlockName("adminAsphaltBlock").setBlockTextureName(Archive.MOD_ID + ":fab/asphaltBlock").setHardness(-1).setResistance(1000).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        adminConcreteBlock = new ModBlock(Material.ground).setBlockName("adminConcreteBlock").setBlockTextureName(Archive.MOD_ID + ":fab/concreteBlock").setHardness(-1).setResistance(1000).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        asphaltBlock = new ModBlock(Material.ground).setBlockName("asphaltBlock").setBlockTextureName(Archive.MOD_ID + ":fab/asphaltBlock").setHardness(1).setResistance(10).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        concreteBlock = new ConcreteBlock();
        concreteCobble = new ModBlock(Material.ground).setBlockName("concreteCobble").setBlockTextureName(Archive.MOD_ID + ":fab/concreteCobble").setHardness(4).setResistance(10).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        cottonZero = new CottonZero();
        cottonOne = new CottonOne();
        cottonTwo = new CottonTwo();
        cottonThree = new CottonThree();
        einkornZero = new EinkornZero();
        einkornOne = new EinkornOne();
        einkornTwo = new EinkornTwo();
        einkornThree = new EinkornThree();
        enormousLeaf = new ModBlock(Material.ground).setBlockName("enormousLeaf").setBlockTextureName(Archive.MOD_ID + ":bio/enormousLeaf").setHardness(1).setResistance(1).setStepSound(Block.soundTypeGrass).setCreativeTab(DeusXMachina.instance.tab);
        enormousLog = new ModBlockTopTexture(Material.ground).setBlockName("enormousLog").setBlockTextureName(Archive.MOD_ID + ":bio/enormousLog").setHardness(1).setResistance(1).setStepSound(Block.soundTypeWood).setCreativeTab(DeusXMachina.instance.tab);
        fertilizedBlock = new ModBlock(Material.ground).setBlockName("fertilizedBlock").setBlockTextureName(Archive.MOD_ID + ":bio/fertilizedBlock").setHardness(4).setResistance(10).setStepSound(Block.soundTypeGrass).setCreativeTab(DeusXMachina.instance.tab);
        flaxZero = new FlaxZero();
        flaxOne = new FlaxOne();
        flaxTwo = new FlaxTwo();
        flaxThree = new FlaxThree();
        geoActive = new ModBlockTopTexture(Material.ground).setBlockName("geoActive").setBlockTextureName(Archive.MOD_ID + ":geo/geoActive").setHardness(-1).setResistance(1000).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        geoGas = new ModBlockTopTexture(Material.ground).setBlockName("geoGas").setBlockTextureName(Archive.MOD_ID + ":geo/geoGas").setHardness(-1).setResistance(-1).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        geoHeavy = new ModBlockTopTexture(Material.ground).setBlockName("geoHeavy").setBlockTextureName(Archive.MOD_ID + ":geo/geoHeavy").setHardness(-1).setResistance(1000).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        geoLight = new ModBlockTopTexture(Material.ground).setBlockName("geoLight").setBlockTextureName(Archive.MOD_ID + ":geo/geoLight").setHardness(-1).setResistance(1000).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        geoShale = new ModBlock(Material.ground).setBlockName("geoShale").setBlockTextureName(Archive.MOD_ID + ":geo/geoShale").setHardness(-1).setResistance(1000).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        hempZero = new HempZero();
        hempOne = new HempOne();
        hempTwo = new HempTwo();
        hempThree = new HempThree();
        monaziteSand = new BlockFalling().setBlockName("monaziteSand").setBlockTextureName(Archive.MOD_ID + ":ore/monaziteSand").setHardness(4).setStepSound(Block.soundTypeSand).setCreativeTab(DeusXMachina.instance.tab);
        mudBrick = new ModBlock(Material.ground).setBlockName("mudBrick").setBlockTextureName(Archive.MOD_ID + ":fab/mudBrick").setHardness(1).setResistance(2).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        reConcreteBlock = new ReConcreteBlock();
        rubberLeaf = new ModBlock(Material.ground).setBlockName("rubberLeaf").setBlockTextureName(Archive.MOD_ID + ":bio/rubberLeaf").setHardness(1).setResistance(1).setStepSound(Block.soundTypeGrass).setCreativeTab(DeusXMachina.instance.tab);
        rubberLog = new ModBlockTopTexture(Material.ground).setBlockName("rubberLog").setBlockTextureName(Archive.MOD_ID + ":bio/rubberLog").setHardness(1).setResistance(1).setStepSound(Block.soundTypeWood).setCreativeTab(DeusXMachina.instance.tab);
        sugarcaneZero = new SugarcaneZero();
        sugarcaneOne = new SugarcaneOne();
        sugarcaneTwo = new SugarcaneTwo();
        switchgrassZero = new SwitchgrassZero();
        switchgrassOne = new SwitchgrassOne();
        switchgrassTwo = new SwitchgrassTwo();
        tilledFertilizedBlock = new TilledFertilizedBlock();
    }

    private static void registerBlocks() {
        MinecraftHelper.registerBlock(adminAsphaltBlock);
        MinecraftHelper.registerBlock(adminConcreteBlock);
        MinecraftHelper.registerBlock(asphaltBlock);
        MinecraftHelper.registerBlock(concreteBlock);
        MinecraftHelper.registerBlock(concreteCobble);
        MinecraftHelper.registerBlock(cottonZero);
        MinecraftHelper.registerBlock(cottonOne);
        MinecraftHelper.registerBlock(cottonTwo);
        MinecraftHelper.registerBlock(cottonThree);
        MinecraftHelper.registerBlock(einkornZero);
        MinecraftHelper.registerBlock(einkornOne);
        MinecraftHelper.registerBlock(einkornTwo);
        MinecraftHelper.registerBlock(einkornThree);
        MinecraftHelper.registerBlock(enormousLeaf);
        MinecraftHelper.registerBlock(enormousLog);
        MinecraftHelper.registerBlock(fertilizedBlock);
        MinecraftHelper.registerBlock(flaxZero);
        MinecraftHelper.registerBlock(flaxOne);
        MinecraftHelper.registerBlock(flaxTwo);
        MinecraftHelper.registerBlock(flaxThree);
        MinecraftHelper.registerBlock(monaziteSand);
        MinecraftHelper.registerBlock(geoActive);
        MinecraftHelper.registerBlock(geoGas);
        MinecraftHelper.registerBlock(geoHeavy);
        MinecraftHelper.registerBlock(geoLight);
        MinecraftHelper.registerBlock(geoShale);
        MinecraftHelper.registerBlock(hempZero);
        MinecraftHelper.registerBlock(hempOne);
        MinecraftHelper.registerBlock(hempTwo);
        MinecraftHelper.registerBlock(hempThree);
        MinecraftHelper.registerBlock(mudBrick);
        MinecraftHelper.registerBlock(reConcreteBlock);
        MinecraftHelper.registerBlock(rubberLeaf);
        MinecraftHelper.registerBlock(rubberLog);
        MinecraftHelper.registerBlock(sugarcaneZero);
        MinecraftHelper.registerBlock(sugarcaneOne);
        MinecraftHelper.registerBlock(sugarcaneTwo);
        MinecraftHelper.registerBlock(switchgrassZero);
        MinecraftHelper.registerBlock(switchgrassOne);
        MinecraftHelper.registerBlock(switchgrassTwo);
        MinecraftHelper.registerBlock(tilledFertilizedBlock);
    }
}