package dxm;

import cpw.mods.fml.common.IWorldGenerator;
import dxm.blocks.MaterialTypes;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class BiomeGen implements IWorldGenerator {
    public BiomeGen() {
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if(world.provider.dimensionId == 0) {
            this.generateSurface(world, random, chunkX << 4, chunkZ << 4);
        }
    }

    public void generateSurface(World par1World, Random par2Random, int chunkX, int chunkZ) {
        String s = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
        if(s.startsWith("Forest"))
            if(s.startsWith("Jungle"))
                if(s.startsWith("Mesa"))
                    if(s.startsWith("Plains"))
                        if(s.startsWith("Savanna")) {
                            int rarity = 1;
                            int veinSize = 100;
                            int height = 64;
                            for(int i = 0; i < rarity; ++i) {
                                int randomPosX = chunkX + par2Random.nextInt(16);
                                int randomPosY = par2Random.nextInt(height);
                                int randomPosZ = chunkZ + par2Random.nextInt(16);
                                (new WorldGenMinable(MaterialTypes.BAUXITE.getOre(), veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
                            }
                        }
    }
}
