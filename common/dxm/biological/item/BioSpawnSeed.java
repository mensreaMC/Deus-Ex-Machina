package dxm.biological.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class BioSpawnSeed extends ItemSeeds {
    public BioSpawnSeed(int id, int type, String name, int textureInd) {
        super(id, type, Block.tilledField.blockID);
        // setTextureFile(DrugMain.tex);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName(name);
        // setIconIndex(textureInd);
    }

    public BioSpawnSeed(int id, int type, String name, int blockIDCanStayAt, int textureInd) {
        super(id, type, blockIDCanStayAt);
        // setTextureFile(DrugMain.tex);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName(name);
        // setIconIndex(textureInd);
    }
}