package dxm.mod;

import cpw.mods.fml.common.IWorldGenerator;
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
        }
    }

    private void generateEnd(World world, Random random, int x, int z) {
    }

    private void generateSurface(World world, Random random, int x, int z) {
        addOreSpawn(dxm.bauxiteOre, world, random, x, z, 16, 16, 40 + random.nextInt(3), 5, 1, 64);
        addOreSpawn(dxm.cassititeriteOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.coalOre, world, random, x, z, 16, 16, 50, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.galenaOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.hematiteOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.limestoneOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.malachiteOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.monaziteSand, world, random, x, z, 16, 16, 90, random.nextInt(3), 58, 64);
        addOreSpawn(dxm.nativegoldOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.sulfurOre, world, random, x, z, 16, 16, 50, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.uraniniteOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
    }
    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration
     * extending Class
     **/
    public void addOreSpawn(Block block,
                            World world,
                            Random random,
                            int blockXPos,
                            int blockZPos,
                            int maxX,
                            int maxZ,
                            int maxVeinSize,
                            int chancesToSpawn,
                            int minY,
                            int maxY) {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert (maxX > 0) && (maxX <= 16) : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert (maxY < 256) && (maxY > 0) : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert (maxZ > 0) && (maxZ <= 16) : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}