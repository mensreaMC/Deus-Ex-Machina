package dxm.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;

public class ModBlockTopTexture extends ModBlock {

    public ModBlockTopTexture(Material mat) {
        super(mat);
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