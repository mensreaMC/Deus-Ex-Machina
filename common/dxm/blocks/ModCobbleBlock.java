package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModCobbleBlock extends Block {

    MaterialTypes type;

    public ModCobbleBlock(MaterialTypes type) {
        super(DeusXMachina.instance.config.getBlock(type.toCobble(), ModBlocks.getID()).getInt(), Material.rock);
        this.type = type;
        setupBlock();
        setStepSound(Block.soundStoneFootstep);
    }

    private void setupBlock() {
        setUnlocalizedName(type.toCobble());
        setCreativeTab(DeusXMachina.instance.tab);
        setTextureName(Archive.MOD_ID + ":cobble/" + type.toCobble());
        GameRegistry.registerBlock(this, Archive.MOD_ID + "." + type.toCobble());
    }


}