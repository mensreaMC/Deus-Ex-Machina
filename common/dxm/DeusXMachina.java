package dxm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import dxm.blocks.MaterialTypes;
import dxm.blocks.ModBlocks;
import dxm.utils.library.Archive;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;

@Mod(modid = Archive.MOD_ID)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DeusXMachina {

    @Mod.Instance(Archive.MOD_ID)
    public static DeusXMachina instance;

    public final CreativeTabs tab = new CreativeTabs(Archive.MOD_ID);
    public final EventManager eventmanager = new EventManager();
    public Configuration config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        config = new Configuration(event.getSuggestedConfigurationFile(), true);
        ModBlocks.setup();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(eventmanager);
    }
}