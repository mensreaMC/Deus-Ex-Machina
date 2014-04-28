package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
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
        
        GameRegistry.registerBlock(adminAsphaltBlock, adminAsphaltBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(asphaltBlock, asphaltBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(adminConcreteBlock, adminConcreteBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(concreteCobble, concreteCobble.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(concreteBlock, concreteBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(fertilizedBlock, fertilizedBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(monaziteSand, monaziteSand.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(geoActive, geoActive.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(geoGas, geoGas.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(geoHeavy, geoHeavy.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(geoLight, geoLight.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(geoShale, geoShale.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(mudBrick, mudBrick.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(reConcreteBlock, reConcreteBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(rubberLeaf, rubberLeaf.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(rubberLog, rubberLog.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(tilledFertilizedBlock, tilledFertilizedBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
    }
}