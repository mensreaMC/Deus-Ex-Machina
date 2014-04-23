package dxm.blocks;


import cpw.mods.fml.common.registry.GameRegistry;
import dxm.DeusXMachina;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;

public class ModOreBlock extends BlockOre {

    public ModOreBlock(int id, String name) {
        super(id);
        setupBlock(name);
        setStepSound(Block.soundStoneFootstep);
    }

    private void setupBlock(String name) {
        setUnlocalizedName(name);
        setCreativeTab(DeusXMachina.instance.tab);
        setTextureName(Archive.MOD_ID + ":ore/" + name);
        GameRegistry.registerBlock(this, Archive.MOD_ID + "." + name);
    }
}
