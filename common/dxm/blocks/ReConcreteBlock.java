package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class ReConcreteBlock extends ModBlockTopTexture {

    public ReConcreteBlock() {
        super(Material.ground);
        setHardness(20.0F);
        setResistance(80);
        setStepSound(Block.soundTypeStone);
        setBlockName("reConcreteBlock");
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":fab/concreteBlock");
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_) {
        return Item.getItemFromBlock(ModBlocks.concreteCobble);
    }
}