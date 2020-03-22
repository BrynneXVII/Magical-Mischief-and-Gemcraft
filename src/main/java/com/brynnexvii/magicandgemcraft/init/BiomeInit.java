package com.brynnexvii.magicandgemcraft.init;


import com.brynnexvii.magicandgemcraft.MagicAndGemcraft;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, MagicAndGemcraft.MOD_ID);

	
	public static void registerBiomes() {
		//registerBiome(EXAMPLE_BIOME.get(), Type.FOREST, Type.OVERWORLD, Type.MAGICAL);
	}
	
	private static void registerBiome(Biome biome, Type... types) {
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
	}
}
