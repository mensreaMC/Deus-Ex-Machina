package dxm.blocks;

import net.minecraft.block.Block;

public enum MaterialTypes {

    BAUXITE,
    CASSITITERITE,
    GALENA,
    HEMATITE,
    LIMESTONE;

    private final Block cobble;
    private final Block ore;

    MaterialTypes(){
        ore = new ModOreBlock(ModBlocks.ID++, toOre());
        cobble = new ModCobbleBlock(ModBlocks.ID++, toCobble());
    }

    public static void setup(){}

    public Block getOre() {
        return ore;
    }

    public Block getCobble() {
        return cobble;
    }

    public String toOre() {
        return toString() + "Ore";
    }

    public String toCobble() {
        return toString()+ "Cobble";
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}