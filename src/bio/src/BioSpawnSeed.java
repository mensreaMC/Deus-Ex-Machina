package bio.src;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class BioSpawnSeed extends ItemSeeds
{
  public BioSpawnSeed(int id, int type, String name, int textureInd)
  {
    super(id, type, Block.tilledField.blockID);
    //setTextureFile(DrugMain.tex);
    setCreativeTab(CreativeTabs.tabMisc);
    setUnlocalizedName(name);
   // setIconIndex(textureInd);
  }

  public BioSpawnSeed(int id, int type, String name, int blockIDCanStayAt, int textureInd)
  {
    super(id, type, blockIDCanStayAt);
   // setTextureFile(DrugMain.tex);
    setCreativeTab(CreativeTabs.tabMisc);
    setUnlocalizedName(name);
   // setIconIndex(textureInd);
  }

  /*public String getTextureFile()
  {
    return DrugMain.tex;
  }*/
  
  @Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(BioSpawnMain.modID + ":" + this.getUnlocalizedName());
	}
}