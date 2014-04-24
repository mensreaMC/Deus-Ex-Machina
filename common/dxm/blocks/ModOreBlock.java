package dxm.blocks;


import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import java.util.Random;

public class ModOreBlock extends BlockOre {

    MaterialTypes type;

    public ModOreBlock(MaterialTypes type) {
        this.type = type;
        setupBlock();
        setStepSound(Block.soundTypeStone);
    }

    private void setupBlock() {
        setBlockName(type.toOre());
        setCreativeTab(DeusXMachina.instance.tab);
        setBlockTextureName(Archive.MOD_ID + ":ore/" + type.toOre());
        GameRegistry.registerBlock(this, Archive.MOD_ID + "." + type.toOre());
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(type.getCobble());
    }
}