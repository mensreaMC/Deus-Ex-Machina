package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModGravelBlock extends Block {

    public ModGravelBlock(int id, String name) {
        super(id, Material.sand);
        setupBlock(name);
        setStepSound(Block.soundGravelFootstep);
    }

    private void setupBlock(String name) {
        setUnlocalizedName(name);
        setCreativeTab(DeusXMachina.instance.tab);
        setTextureName(Archive.MOD_ID + ":gravel/" + name);
        GameRegistry.registerBlock(this, Archive.MOD_ID + "." + name);
    }


}