package dxm.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dxm.DeusXMachina;
import dxm.items.ModItems;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class ReConcreteBlock extends Block {
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
               //Item.getItemFromBlock(ModItems.rebar);
    }

    @SideOnly(Side.CLIENT)
    private IIcon top;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(getTextureName());
        top = register.registerIcon(getTextureName() + "Top");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side == ForgeDirection.UP.ordinal() ? top : blockIcon;
    }
}