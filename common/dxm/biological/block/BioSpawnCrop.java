package dxm.biological.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import dxm.biological.BioSpawnConfig;
import dxm.biological.BioSpawnMain;

public class BioSpawnCrop extends BlockCrops
{
    protected ItemSeeds mySeed;
    protected Item myProduct;
    private int fertileGrowthRate;
    private int nonFertileGrowthRate;
    private int myTexIndex;
    public static int blockID;

    public BioSpawnCrop(int id, int texIndex, ItemSeeds seed, Item product, int fertGrowth, int nonFertGrowth, String name)
    {
        // super(id, texIndex);
        super(id);
        mySeed = seed;
        myProduct = product;
        fertileGrowthRate = fertGrowth;
        nonFertileGrowthRate = nonFertGrowth;
        myTexIndex = texIndex;
        setTickRandomly(true);
        // setRequiresSelfNotify(); XXX
        // setTextureFile(DrugMain.tex);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName(name);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F, 1.0F);
    }

    public String getTextureFile()
    {
        return BioSpawnMain.tex;
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (world.getBlockMetadata(x, y, z) < 3)
        {
            if ((random.nextInt(isFertile(world, x, y - 1, z) ? fertileGrowthRate : nonFertileGrowthRate) == 0) && (canSeeSky(world, x, y, z)))
            {
                world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) + 1, 3);
                setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F + (world.getBlockMetadata(x, y, z) * 0.2F), 1.0F);
            }
        }
    }

    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        return EnumPlantType.Crop;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    public int getBlockTextureFromSideAndMetadata(int side, int metadata)
    {
        return myTexIndex + metadata;
    }

    @Override
    protected int getSeedItem()
    {
        return mySeed.itemID;
    }

    @Override
    public int idDropped(int metadata, Random random, int par2)
    {
        return -1;
    }

    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metaData, int levelEnchant)
    {
        ArrayList<ItemStack> itemList = new ArrayList<ItemStack>();
        if (metaData < 3)
        {
            itemList.add(new ItemStack(mySeed));
            return itemList;
        }
        if (metaData == 3)
        {
            itemList.add(new ItemStack(myProduct));
            for (int i = 0; i < (3 + levelEnchant); i++)
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
    protected int getCropItem()
    {
        return myProduct.itemID;
    }

    @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        return world.getBlockId(x, y - 1, z) == Block.tilledField.blockID;
    }

    @Override
    public void fertilize(World world, int x, int y, int z)
    {
        if ((BioSpawnConfig.canFertilize) && (canSeeSky(world, x, y, z)))
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 3); // 3?
            setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8F, 1.0F);
        }
    }

    public boolean canSeeSky(World world, int x, int y, int z)
    {
        for (int i = y + 1; i < 256; i++)
        {
            if ((!world.isAirBlock(x, i, z))
                && (!((Block.blocksList[world.getBlockId(x, i, z)] instanceof BlockBreakable)
                      || (world.getBlockId(x, i, z) == Block.waterMoving.blockID) || (world.getBlockId(x, i, z) == Block.waterStill.blockID))))
            {
                return false;
            }
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        icons = new Icon[4];
        for (int i = 0; i < icons.length; i++)
        {
            icons[i] = par1IconRegister.registerIcon(BioSpawnMain.modID + ":" + (getUnlocalizedName().substring(5)) + "_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        if ((par2 < 0) || (par2 > 3))
        {
            par2 = 3;
        }
        return icons[par2];
    }
}
