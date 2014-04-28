package dxm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dxm.blocks.ModBlocks;
import dxm.items.ModItems;
import dxm.utils.library.Archive;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = Archive.MOD_ID)
public class DeusXMachina {

    @Mod.Instance(Archive.MOD_ID)
    public static DeusXMachina instance;

    public final EventManager eventmanager = new EventManager();
    public final BiomeGen biomegen = new BiomeGen();

    public final CreativeTabs tab = (new CreativeTabs(Archive.MOD_ID) {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.cobblestone);
        }
    });

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.setup();
        ModItems.setup();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(eventmanager, 1);
        GameRegistry.registerWorldGenerator(biomegen, 2);
    }
}