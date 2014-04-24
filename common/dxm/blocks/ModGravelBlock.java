package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModGravelBlock extends Block {

    MaterialTypes type;

    public ModGravelBlock(MaterialTypes type) {
        super(Material.sand);
        this.type = type;
        setupBlock();
        setStepSound(Block.soundTypeGravel);
    }

    private void setupBlock() {
        setBlockName(type.toGravel());
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":gravel/" + type.toGravel());
        GameRegistry.registerBlock(this, Archive.MOD_ID + "." + type.toGravel());
    }


}