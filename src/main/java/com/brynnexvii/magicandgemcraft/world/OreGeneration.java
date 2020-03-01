package com.brynnexvii.magicandgemcraft.world;

import com.brynnexvii.magicandgemcraft.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRange;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	public static void setupOreGeneration() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			CountRangeConfig purple_gem_ore_placement = new CountRangeConfig(1000, 10, 10, 100); //(veins per chunk, min height, max height base ?? {set = min height}, max height)  
			//biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlockInit.purple_gem_ore.getDefaultState(), OregenConfig.)), (Feature.MINEABLE, new MineableConfig(MineableConfig.IS_ROCK), Blocklist.purple_gem_ore, 20), new CountRange(), purple_gem_ore_placement); //last number is how many max in vein
		}
	}
}
