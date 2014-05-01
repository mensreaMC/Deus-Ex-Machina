package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class RubberLeaf extends Block {
    public RubberLeaf() {
        super(Material.ground);
        setHardness(1.0F);
        setResistance(1);
        setStepSound(Block.soundTypeGrass);
        setBlockName("rubberLeaf");
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":bio/rubberLeaf");
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(ModBlocks.rubberLeaf);
    }
}