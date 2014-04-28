package dxm;

import cpw.mods.fml.common.IWorldGenerator;
import dxm.blocks.MaterialTypes;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class BiomeGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if(world.provider.dimensionId == 0) {
            this.generateSurface(world, random, chunkX << 4, chunkZ << 4);
        }
    }

    public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        String s = world.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
        if(s.startsWith("Forest"))
            if(s.startsWith("Jungle"))
                if(s.startsWith("Mesa"))
                    if(s.startsWith("Plains"))
                        if(s.startsWith("Savanna")) {
                            int rarity = 1;
                            int veinSize = 100;
                            int height = 64;
                            for(int i = 0; i < rarity; ++i) {
                                int randomPosX = chunkX + random.nextInt(16);
                                int randomPosY = random.nextInt(height);
                                int randomPosZ = chunkZ + random.nextInt(16);
                                (new WorldGenMinable(MaterialTypes.BAUXITE.getOre(), veinSize)).generate(world, random, randomPosX, randomPosY, randomPosZ);
                            }
                        }
    }
}
