package dxm;

import cpw.mods.fml.common.IWorldGenerator;
import dxm.blocks.MaterialTypes;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class EventManager implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId) {
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateSurface(World world, Random random, int x, int z) {
        addOreSpawn(MaterialTypes.BAUXITE.getOre(), world, random, x, z, 16, 16, 50, random.nextInt(1), 54, 64);
        addOreSpawn(MaterialTypes.CASSITITERITE.getOre(), world, random, x, z, 16, 16, 15, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.COAL.getOre(), world, random, x, z, 16, 16, 50, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.GALENA.getOre(), world, random, x, z, 16, 16, 15, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.HEMATITE.getOre(), world, random, x, z, 16, 16, 40, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.LIMESTONE.getOre(), world, random, x, z, 16, 16, 50, random.nextInt(1), 1, 64);
        addOreSpawn(MaterialTypes.MALACHITE.getOre(), world, random, x, z, 16, 16, 15, random.nextInt(3), 1, 64);
        //addOreSpawn(MaterialTypes.MONAZITE.getOre(), world, random, x, z, 16, 16, 90, random.nextInt(1), 54, 74);
        addOreSpawn(MaterialTypes.NATIVEGOLD.getOre(), world, random, x, z, 16, 16, 5, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.SULFUR.getOre(), world, random, x, z, 16, 16, 50, random.nextInt(1), 1, 32);
        addOreSpawn(MaterialTypes.URANINITE.getOre(), world, random, x, z, 16, 16, 5, random.nextInt(3), 1, 64);
    }

    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration
     * extending Class
     */
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        if(canSpawn(maxY, minY, maxX, maxZ)) {
            int deltaY = maxY - minY;
            for(int x = 0; x < chancesToSpawn; x++) {
                int posX = blockXPos + random.nextInt(maxX);
                int posY = minY + random.nextInt(deltaY);
                int posZ = blockZPos + random.nextInt(maxZ);
                new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
            }
        }
    }

    private boolean canSpawn(int maxY, int minY, int maxX, int maxZ) {
        if(maxY > minY) {
            if((maxY < 256) && (maxY > 0)) {
                if(minY > 0) {
                    if((maxX > 0) && (maxX <= 16)) {
                        if((maxZ > 0) && (maxZ <= 16)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}