package dxm.blocks;

import dxm.DeusXMachina;
import dxm.items.ModItems;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class HempOne extends Block {

    public HempOne() {
        super(Material.ground);
        setHardness(1.0F);
        setResistance(1);
        setStepSound(Block.soundTypeStone);
        setBlockName("hempOne");
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":bio/hempOne");
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(ModItems.hempBundle));
        return ret;
    }
}