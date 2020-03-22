package com.brynnexvii.magicandgemcraft.world.gen;

import com.brynnexvii.magicandgemcraft.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class GemcraftOreGeneration {
	public static void setupOreGeneration() {
		ConfiguredPlacement rarePlacement = Placement.COUNT_RANGE.configure(new CountRangeConfig(25, 5, 5, 40)); //(how common(20 > coal), bottom offset, top offset, max height (then - offset))
		ConfiguredPlacement uncommonPlacement = Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 5, 5, 50));
		for(Biome biome : ForgeRegistries.BIOMES) { //goes through every biome registered to forge -> into mod ones if they're registered!
			if(biome == Biomes.DARK_FOREST || biome == Biomes.DARK_FOREST_HILLS) {
				//black ore biomes
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(uncommonPlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
			} else if(biome == Biomes.SNOWY_MOUNTAINS || biome == Biomes.SNOWY_TUNDRA) {
				//white ore biomes
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(uncommonPlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
			} else if(biome == Biomes.SUNFLOWER_PLAINS || biome == Biomes.FLOWER_FOREST) {
				//purple ore biomes, are these the right fits?
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(uncommonPlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
			} else if(biome == Biomes.OCEAN) {
				//blue ore biomes
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(uncommonPlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
			} else if(biome == Biomes.FOREST) { //is this too big of a biome class???
				//green ore biomes
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(uncommonPlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
			} else if(biome == Biomes.DESERT || biome == Biomes.DESERT_HILLS) {
				//yellow ore biomes
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
			} else if(biome == Biomes.BADLANDS || biome == Biomes.BADLANDS_PLATEAU) {
				//orange ore biomes
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(uncommonPlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
			} else if(biome == Biomes.SAVANNA || biome == Biomes.SAVANNA_PLATEAU) {
				//red ore biomes
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(uncommonPlacement));
			} else {
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RAINBOW_GEM_ORE.get().getDefaultState(),8)).withPlacement(rarePlacement)); //last numbers are max vein size
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.WHITE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLACK_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.PURPLE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.BLUE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.GREEN_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.YELLOW_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.ORANGE_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								BlockInit.RED_GEM_ORE.get().getDefaultState(),5)).withPlacement(rarePlacement));
			}
		}
		
	}
}
