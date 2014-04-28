package dxm.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;

public class GeoActive extends Block {
    public GeoActive() {
        super(Material.ground);
        setHardness(999);
        setResistance(999);
        setStepSound(Block.soundTypeStone);
        setBlockName("geoActive");
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":geo/geoActive");
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