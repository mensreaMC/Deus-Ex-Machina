package dxm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModCobbleBlock extends Block {

    public ModCobbleBlock(int id, String name) {
        super(id, Material.rock);
        setupBlock(name);
    }

    private void setupBlock(String name) {
        setUnlocalizedName(name);
        setCreativeTab(DeusXMachina.instance.tab);
        setTextureName(Archive.MOD_ID + ":" + name);
        GameRegistry.registerBlock(this, Archive.MOD_ID + "." + name);
    }


}