package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block concreteCobble;
    public static Block concreteBlock;
    public static Block reConcreteBlock;
    public static Block fertilizedBlock;
    public static Block tilledFertilizedBlock;
    public static Block monaziteSand;

    public static void setup() {
        MaterialTypes.setup();
        
        concreteCobble = new ModBlock(Material.ground).setBlockName("concreteCobble").setBlockTextureName(Archive.MOD_ID + ":fab/concreteCobble").setHardness(4).setResistance(10).setStepSound(Block.soundTypeStone).setCreativeTab(DeusXMachina.instance.tab);
        concreteBlock = new ConcreteBlock();
        reConcreteBlock = new ReConcreteBlock(); 
        fertilizedBlock = new ModBlock(Material.ground).setBlockName("fertilizedBlock").setBlockTextureName(Archive.MOD_ID + ":bio/fertilizedBlock").setHardness(4).setResistance(10).setStepSound(Block.soundTypeGrass).setCreativeTab(DeusXMachina.instance.tab);
        tilledFertilizedBlock = new TilledFertilizedBlock();
        monaziteSand = new BlockFalling().setBlockName("monaziteSand").setBlockTextureName(Archive.MOD_ID + ":ore/monaziteSand").setHardness(4).setStepSound(Block.soundTypeSand).setCreativeTab(DeusXMachina.instance.tab);

        GameRegistry.registerBlock(concreteCobble, concreteCobble.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(concreteBlock, concreteBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(reConcreteBlock, reConcreteBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(fertilizedBlock, fertilizedBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(tilledFertilizedBlock, tilledFertilizedBlock.getUnlocalizedName().replace("tile", Archive.MOD_ID));
        GameRegistry.registerBlock(monaziteSand, monaziteSand.getUnlocalizedName().replace("tile", Archive.MOD_ID));
    }
}