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

public class RubberLog extends Block {

    public RubberLog() {
        super(Material.ground);
        setHardness(2.0F);
        setResistance(2);
        setStepSound(Block.soundTypeWood);
        setBlockName("rubberLog");
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":bio/rubberLog");
    }

    @SideOnly(Side.CLIENT)
    private IIcon centerIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(getTextureName());
        centerIcon = register.registerIcon(getTextureName() + "Center");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if(side == ForgeDirection.UP.ordinal() || side == ForgeDirection.DOWN.ordinal()) {
            return centerIcon;
        }
        return blockIcon;
    }
}