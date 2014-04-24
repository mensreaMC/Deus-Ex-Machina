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

    private Block cobble;
    private Block ore;
    private Block gravel;
    private final float hardness;

    MaterialTypes(float hardness) {
        this.hardness = hardness;
    }

    public static void setup() {
        for(MaterialTypes mat : MaterialTypes.values()) {
            mat.ore = new ModOreBlock(mat).setHardness(mat.hardness);
            mat.cobble = new ModCobbleBlock(mat).setHardness(mat.hardness / 2);
            mat.gravel = new ModGravelBlock(mat).setHardness(mat.hardness / 3);
        }
    }

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
        return toString() + "Cobble";
    }

    public String toGravel() {
        return toString() + "Gravel";
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}