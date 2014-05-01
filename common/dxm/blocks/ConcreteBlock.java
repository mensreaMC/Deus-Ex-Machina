package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class ConcreteBlock extends Block {

    public ConcreteBlock() {
        super(Material.ground);
        this.slipperiness = 0.98F;
        setHardness(10.0F);
        setResistance(40);
        setStepSound(Block.soundTypeStone);
        setBlockName("concreteBlock");
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":fab/concreteBlock");
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_) {
        return Item.getItemFromBlock(ModBlocks.concreteCobble);
    }
}