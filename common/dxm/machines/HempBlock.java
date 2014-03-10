package dxm.machines;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import dxm.biological.BioSpawnConfig;
import dxm.biological.BioSpawnMain;
import dxm.biological.block.BioSpawnCrop;

public class HempBlock extends BioSpawnCrop
{
    private int theID;
    private boolean hasGrown = false;

    public HempBlock(int id, int texIndex, ItemSeeds seed, Item product, int fertGrowth, int nonFertGrowth, String name)
    {
        super(id, texIndex, seed, product, fertGrowth, nonFertGrowth, name);
        theID = id;
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void fertilize(World world, int x, int y, int z)
    {
        if ((BioSpawnConfig.canFertilize) && (world.getBlockMetadata(x, y, z) < 3))
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 3); // 3?
            world.setBlockMetadataWithNotify(x, y + 1, z, 3, 3);
            world.setBlock(x, y - 1, z, theID);
        }
    }

    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metaData, int levelEnchant)
    {
        ArrayList<ItemStack> itemList = new ArrayList<ItemStack>();
        itemList.add(new ItemStack(mySeed, 1));
        if (metaData == 3)
        {
            itemList.add(new ItemStack(myProduct));
            for (int i = 0; i < (2 + levelEnchant); i++)
            {
                if (world.rand.nextInt(3) != 2)
                {
                    continue;
                }
                itemList.add(new ItemStack(mySeed));
            }
        }
        return itemList;
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        boolean shouldGrow = (random.nextInt(isFertile(world, x, y - 1, z) ? BioSpawnConfig.HempFertileGrowth : BioSpawnConfig.HempNonFertileGrowth) == 0)
                             && (canSeeSky(world, x, y, z));
        if ((world.getBlockMetadata(x, y, z) == 2) && (world.getBlockId(x, y - 1, z) != theID))
        {
            if (world.getBlockId(x, y + 1, z) != 0)
            {
                return;
            }
            if (shouldGrow)
            {
                if (!hasGrown)
                {
                    world.setBlock(x, y + 1, z, theID);
                    if (world.getBlockId(x, y - 1, z) == theID)
                    {
                        hasGrown = true;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if ((world.getBlockMetadata(x, y, z) < 3) && (shouldGrow))
        {
            world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) + 1, 3); // 3?
        }
    }

    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return (world.getBlockId(x, y - 1, z) == Block.tilledField.blockID) || (world.getBlockId(x, y - 1, z) == theID);
    }

    @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        return ((world.getBlockId(x, y - 1, z) == Block.tilledField.blockID) || (world.getBlockId(x, y - 1, z) == theID))
               && ((world.getFullBlockLightValue(x, y, z) >= 8) || (world.canBlockSeeTheSky(x, y, z)));
    }

    @Override
    public String getTextureFile()
    {
        return BioSpawnMain.tex;
    }
}