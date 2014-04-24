package dxm.blocks;


import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;

import java.util.Random;

public class ModOreBlock extends BlockOre {

    MaterialTypes type;

    public ModOreBlock(MaterialTypes type) {
        super(DeusXMachina.instance.config.getBlock(type.toOre(), ModBlocks.getID()).getInt());
        this.type = type;
        setupBlock();
        setStepSound(Block.soundStoneFootstep);
    }

    private void setupBlock() {
        setUnlocalizedName(type.toOre());
        setCreativeTab(DeusXMachina.instance.tab);
        setTextureName(Archive.MOD_ID + ":ore/" + type.toOre());
        GameRegistry.registerBlock(this, Archive.MOD_ID + "." + type.toOre());
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return type.getCobble().blockID;
    }
}