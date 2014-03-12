package dxm.biological;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class BioSpawnConfig {
    public static boolean canFertilize;
    public static int HempFertileGrowth;
    public static int HempNonFertileGrowth;
    public static int HempSeedsID;
    public static int HempBlockID;
    public static int HempItemID;

    public static void configurate(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        canFertilize = Boolean.parseBoolean(config.get("Growthrate and Fertilization", "Bonemeal Fertilization:", "true").getString());
        HempFertileGrowth = Integer.parseInt(config.get("Growthrate and Fertilization", "Hemp Fertile Growthrate", "12").getString());
        HempNonFertileGrowth = Integer.parseInt(config.get("Growthrate and Fertilization", "Hemp Non-Fertile Growthrate:", "25").getString());
        HempSeedsID = Integer.parseInt(config.get("item", "Hemp Seeds ID:", "6000").getString());
        HempItemID = Integer.parseInt(config.get("item", "Hemp Item ID:", "6001").getString());
        HempBlockID = Integer.parseInt(config.get("block", "Hemp Block ID:", "800").getString());
        config.save();
    }
}