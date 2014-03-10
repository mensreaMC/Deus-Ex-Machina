package bio.src;

import net.minecraftforge.client.MinecraftForgeClient;

public class BioClientProxy extends BioCommonProxy
{
  public void RegisterRenderThings()
  {
	  super.RegisterRenderThings();
	  MinecraftForgeClient.preloadTexture("/drugs/textures/items.png");
	  MinecraftForgeClient.preloadTexture("/drugs/textures/Potions.png");
  }
}