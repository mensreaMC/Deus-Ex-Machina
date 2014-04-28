package dxm.blocks;

import dxm.DeusXMachina;
import dxm.items.ModItems;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
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
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(ModItems.rebar));
        ret.add(new ItemStack(ModBlocks.concreteCobble));
        return ret;
    }
}