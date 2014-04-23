package dxm.blocks;

import net.minecraft.block.Block;

public enum MaterialTypes {

    BAUXITE(2.0F),
    CASSITITERITE(1.0F),
    COAL(0.5F),
    GALENA(1.0F),
    HEMATITE(2.0F),
    LIMESTONE(1.0F),
    MALACHITE(1.0F),
    NATIVEGOLD(1.0F),
    SULFUR(0.5F),
    URANINITE(1.0F);
    
    private final Block cobble;
    private final Block ore;
    private final Block gravel;

    MaterialTypes(float hardness){
        ore = new ModOreBlock(ModBlocks.ID++, toOre()).setHardness(hardness);
        cobble = new ModCobbleBlock(ModBlocks.ID++, toCobble()).setHardness(hardness / 2);
        gravel = new ModGravelBlock(ModBlocks.ID++, toGravel()).setHardness(hardness / 3);
    }

    public static void setup(){}

    public Block getOre() {
        return ore;
    }

    public Block getCobble() {
        return cobble;
    }
    
    public Block getGravel() {
        return gravel;
    }

    public String toOre() {
        return toString() + "Ore";
    }

    public String toCobble() {
        return toString()+ "Cobble";
    }

    public String toGravel() {
        return toString()+ "Gravel";
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}