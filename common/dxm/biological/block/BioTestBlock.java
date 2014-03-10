package dxm.biological.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BioTestBlock extends Block
{
    public BioTestBlock(int par1, Material par2Material)
    {
        super(par1, par2Material);
        setCreativeTab(CreativeTabs.tabBlock);
        setUnlocalizedName("BioTestBlock");
    }

    // @Override
    // public boolean canPlaceBlockAt(World world, int x, int y, int z)
    // {// TODO FIX PROBLEM
    // return world.getBlockId(x, y - 1, z) == Block.BlockTilledfertilizedBlock.blockID;
    // }
    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metadata)
    {
        int numDirt = 0;
        if (world.getBlockId(x - 1, y - 1, z) == Block.dirt.blockID)
        {
            numDirt++;
        }
        if (world.getBlockId(x + 1, y - 1, z) == Block.dirt.blockID)
        {
            numDirt++;
        }
        if (world.getBlockId(x, y - 1, z - 1) == Block.dirt.blockID)
        {
            numDirt++;
        }
        if (world.getBlockId(x, y - 1, z + 1) == Block.dirt.blockID)
        {
            numDirt++;
        }
        if (numDirt < 1)
        {
            breakBlock(world, x, y, z);
        }
    }

    private void breakBlock(World world, int x, int y, int z)
    {
        world.setBlockToAir(x, y, z);
        for (int i = x - 1; i <= (x + 1); i++)
        {
            for (int j = y - 1; j <= (y + 1); j++)
            {
                for (int k = z - 1; k <= (z + 1); k++)
                {
                    if (world.getBlockId(i, j, k) == blockID)
                    {
                        breakBlock(world, i, j, k);
                    }
                }
            }
        }
    }
}
