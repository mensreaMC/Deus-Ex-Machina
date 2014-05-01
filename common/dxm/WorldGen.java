package dxm;

import cpw.mods.fml.common.IWorldGenerator;
import dxm.blocks.MaterialTypes;
import dxm.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId) {
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateSurface(World world, Random random, int x, int z) {
        //possibly make a config to alter spawn chance and biome spawning
        addOreSpawn(MaterialTypes.CASSITITERITE.getOre(), world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.GALENA.getOre(), world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.HEMATITE.getOre(), world, random, x, z, 16, 16, 50, random.nextInt(3), 1, 80);
        addOreSpawn(MaterialTypes.MALACHITE.getOre(), world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.NATIVEGOLD.getOre(), world, random, x, z, 16, 16, 15, random.nextInt(3), 1, 64);
        addOreSpawn(MaterialTypes.SULFUR.getOre(), world, random, x, z, 16, 16, 100, random.nextInt(2), 1, 32);
        addOreSpawn(MaterialTypes.URANINITE.getOre(), world, random, x, z, 16, 16, 25, random.nextInt(2), 1, 64);

        addSpecialOreSpawn(MaterialTypes.BAUXITE.getOre(), world, random, x, z, 16, 16, 100, random.nextInt(2), 40, 100, new ArrayList<String>(Arrays.asList("Forest", "Jungle", "Savanna")));
        addSpecialOreSpawn(MaterialTypes.COAL.getOre(), world, random, x, z, 16, 16, 100, random.nextInt(2), 40, 100, new ArrayList<String>(Arrays.asList("Swamp", "Hills", "Taiga")));
        addSpecialOreSpawn(MaterialTypes.LIMESTONE.getOre(), world, random, x, z, 16, 16, 100, random.nextInt(2), 40, 100, new ArrayList<String>(Arrays.asList("Plains")));
        addSpecialOreSpawn(ModBlocks.monaziteSand, world, random, x, z, 16, 16, 100, random.nextInt(2), 54, 100, new ArrayList<String>(Arrays.asList("Beach", "Ocean", "River")));
    }

    public void addSpecialOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY, List<String> biomes) {
        if(canSpawn(maxY, minY, maxX, maxZ) && hasRightBiome(world.getBiomeGenForCoords(blockXPos, blockZPos), biomes)) {
            int deltaY = maxY - minY;
            for(int x = 0; x < chancesToSpawn; x++) {
                int posX = blockXPos + random.nextInt(maxX);
                int posY = minY + random.nextInt(deltaY);
                int posZ = blockZPos + random.nextInt(maxZ);
                new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
            }
        }
    }

    private boolean hasRightBiome(BiomeGenBase biome, List<String> biomes) {
        if(biomes.contains(biome.biomeName)) {
            return true;
        }
        return false;
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