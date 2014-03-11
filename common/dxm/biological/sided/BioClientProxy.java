package dxm.biological.sided;

public class BioClientProxy extends BioCommonProxy {
    @Override
    public void RegisterRenderThings() {
        super.RegisterRenderThings();
        // MinecraftForgeClient.preloadTexture("/drugs/textures/items.png");
        // MinecraftForgeClient.preloadTexture("/drugs/textures/Potions.png");
    }
}