package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModCobbleBlock extends Block {

    MaterialTypes type;

    public ModCobbleBlock(MaterialTypes type) {
        super(Material.rock);
        this.type = type;
        setupBlock();
        setStepSound(Block.soundTypeStone);
    }

    private void setupBlock() {
        setBlockName(type.toCobble());
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":cobble/" + type.toCobble());
        GameRegistry.registerBlock(this, Archive.MOD_ID + "." + type.toCobble());
    }


}