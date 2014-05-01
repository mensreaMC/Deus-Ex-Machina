//all i need is something that needs to be planted on tilled fertilized soil OR soil/grass
//that checks to see the sky every X ticks and has a random chance of either becoming another block or placing a block on top of itself
//only 4 growth stages MAX are planned and user can only get things from the final stage which drops 1 item, a cropnameBundle
//it would also be useful if it could be made to only grow in certain biomes


package dxm.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dxm.DeusXMachina;
import dxm.utils.StringHelper;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

import java.util.ArrayList;
import java.util.Random;

public class HempCrop extends BlockCrops {
    protected ItemSeeds mySeed;
    protected Item myProduct;
    private int fertileGrowthRate;
    private int nonFertileGrowthRate;

    public HempCrop(ItemSeeds seed, Item product, int fertGrowth, int nonFertGrowth, String name) {
        this.mySeed = seed;
        this.myProduct = product;
        this.fertileGrowthRate = fertGrowth;
        this.nonFertileGrowthRate = nonFertGrowth;
        setTickRandomly(true);
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockName("hempCrop");
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F, 1.0F);
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if(world.getBlockMetadata(x, y, z) < 3) {
            if(canSeeSky(world, x, y, z)) {
                //
                world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) + 1, 3);
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

    protected int getSeedItem() {
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

    protected int getCropItem() {
        return this.myProduct.itemID;
    }

    public boolean canSeeSky(World world, int x, int y, int z) {
        for(int i = y + 1; i < 256; i++) {
            if((!world.isAirBlock(x, i, z))) {
                return false;
            }
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    private IIcon[] icons = new IIcon[4];

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        for(int i = 0; i < this.icons.length; i++) {
            icons[i] = register.registerIcon(Archive.MOD_ID + ":" + StringHelper.cleanUnlocalizedBlockName(this) + "_" + i);
        }
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        if(par2 < 0 || par2 > 3) {
            par2 = 3;
        }

        return this.icons[par2];
    }
}