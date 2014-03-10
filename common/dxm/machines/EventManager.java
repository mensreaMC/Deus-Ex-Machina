package dxm.machines;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateEnd(World world, Random random, int x, int z)
    {}

    private void generateSurface(World world, Random random, int x, int z)
    {
        addOreSpawn(dxm.squeeBlock, world, random, x, z, 16, 16, 25 + random.nextInt(3), 5, 15, 50);
        addOreSpawn(dxm.bauxiteOre, world, random, x, z, 16, 16, 25 + random.nextInt(3), 5, 1, 64);
        addOreSpawn(dxm.cassititeriteOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.coalOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.galenaOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.hematiteOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.limestoneOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.malachiteOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.monaziteSand, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.nativegoldOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.sulfurOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
        addOreSpawn(dxm.uraniniteOre, world, random, x, z, 16, 16, 25, random.nextInt(3), 1, 64);
    }

    private void generateNether(World world, Random random, int x, int z)
    {}

    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration
     * extending Class
     * 
     * @param The
     *            Block to spawn
     * @param The
     *            World to spawn in
     * @param A
     *            Random object for retrieving random positions within the world to spawn the Block
     * @param An
     *            int for passing the X-Coordinate for the Generation method
     * @param An
     *            int for passing the Z-Coordinate for the Generation method
     * @param An
     *            int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An
     *            int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An
     *            int for setting the maximum size of a vein
     * @param An
     *            int for the Number of chances available for the Block to spawn per-chunk
     * @param An
     *            int for the minimum Y-Coordinate height at which this block may spawn
     * @param An
     *            int for the maximum Y-Coordinate height at which this block may spawn
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
                            int maxY)
    {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert (maxX > 0) && (maxX <= 16) : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert (maxY < 256) && (maxY > 0) : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert (maxZ > 0) && (maxZ <= 16) : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}