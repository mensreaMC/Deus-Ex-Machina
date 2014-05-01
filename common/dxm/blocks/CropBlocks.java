package dxm.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dxm.utils.library.Archive;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

import java.util.ArrayList;
import java.util.Random;

public class CropBlocks extends BlockCrops {
    protected ItemSeeds mySeed;
    protected Item myProduct;
    private int fertileGrowthRate;
    private int nonFertileGrowthRate;
    private int myTexIndex;
    public static int blockID;

    public CropBlocks(int id, int texIndex, ItemSeeds seed, Item product, int fertGrowth, int nonFertGrowth, String name) {
        // super(id, texIndex);
        super();
        this.mySeed = seed;
        this.myProduct = product;
        this.fertileGrowthRate = fertGrowth;
        this.nonFertileGrowthRate = nonFertGrowth;
        this.myTexIndex = texIndex;
        setTickRandomly(true);
        // setRequiresSelfNotify(); XXX
        // setTextureFile(DrugMain.tex);
        setCreativeTab(CreativeTabs.tabMisc);
        getUnlocalizedName();
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F, 1.0F);
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if(world.getBlockMetadata(x, y, z) < 3) {
            if((random.nextInt(isFertile(world, x, y - 1, z) ? this.fertileGrowthRate : this.nonFertileGrowthRate) == 0) && (canSeeSky(world, x, y, z))) {
                world.setBlockMetadataWithNotify(x, y, z,
                        world.getBlockMetadata(x, y, z) + 1, 3);
                setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F + world.getBlockMetadata(x, y, z) * 0.2F, 1.0F);
            }
        }
    }

    public EnumPlantType getPlantType(World world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
        return this.myTexIndex + metadata;
    }

    protected ItemSeeds getSeedItem() {
        return this.mySeed;
    }

    public int idDropped(int metadata, Random random, int par2) {
        return -1;
    }

    public ArrayList getBlockDropped(World world, int x, int y, int z, int metaData, int levelEnchant) {
        ArrayList itemList = new ArrayList();

        if(metaData < 3) {
            itemList.add(new ItemStack(this.mySeed));
            return itemList;
        }

        if(metaData == 3) {
            itemList.add(new ItemStack(this.myProduct));

            for(int i = 0; i < 3 + levelEnchant; i++) {
                if(world.rand.nextInt(3) != 2)
                    continue;
                itemList.add(new ItemStack(this.mySeed));
            }
        }

        return itemList;
    }

    protected Item getCropItem() {
        return this.myProduct;
    }

    //public boolean canBlockStay(World world, int x, int y, int z)
    //{
    //return world.getBlock(x, y - 1, z) == Block;
    //}

    public void fertilize(World world, int x, int y, int z) {
        if((canSeeSky(world, x, y, z))) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 3); //3?
            setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8F, 1.0F);
        }
    }

    public boolean canSeeSky(World world, int x, int y, int z) {
        for(int i = y + 1; i < 256; i++) {
            if(!world.isAirBlock(x, i, z)) {
                return false;
            }
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        icons = new IIcon[4];

        for(int i = 0; i < this.icons.length; i++) {
            this.icons[i] = register.registerIcon(Archive.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)) + "_" + i);
        }
    }


    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public IIcon getIcon(int par1, int par2) {
        if(par2 < 0 || par2 > 3) {
            par2 = 3;
        }

        return (IIcon) this.icons[par2];
    }
}