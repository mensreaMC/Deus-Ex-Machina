package dxm.blocks;

import dxm.DeusXMachina;
import dxm.utils.MinecraftHelper;
import dxm.utils.library.Archive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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
        for(MaterialTypes type : MaterialTypes.values()) {
            type.ore = new ModOreBlock(type).setHardness(type.hardness).setBlockName(type.toOre()).setBlockTextureName(Archive.MOD_ID + ":ore/" + type.toOre()).setCreativeTab(DeusXMachina.instance.tab).setStepSound(Block.soundTypeStone);
            type.cobble = new ModBlock(Material.rock).setHardness(type.hardness / 2).setBlockName(type.toCobble()).setBlockTextureName(Archive.MOD_ID + ":cobble/" + type.toCobble()).setCreativeTab(DeusXMachina.instance.tab).setStepSound(Block.soundTypeStone);
            type.gravel = new ModBlock(Material.sand).setHardness(type.hardness / 3).setBlockName(type.toGravel()).setBlockTextureName(Archive.MOD_ID + ":gravel/" + type.toGravel()).setCreativeTab(DeusXMachina.instance.tab).setStepSound(Block.soundTypeGravel);
            MinecraftHelper.registerBlock(type.ore);
            MinecraftHelper.registerBlock(type.cobble);
            MinecraftHelper.registerBlock(type.gravel);
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