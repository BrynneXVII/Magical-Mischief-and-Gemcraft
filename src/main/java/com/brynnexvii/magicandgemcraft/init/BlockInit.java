package com.brynnexvii.magicandgemcraft.init;

import com.brynnexvii.magicandgemcraft.MagicAndGemcraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MagicAndGemcraft.MOD_ID);
	
	public static final RegistryObject<Block> PURPLE_GEM_ORE = BLOCKS.register("purple_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> BLUE_GEM_ORE = BLOCKS.register("blue_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> GREEN_GEM_ORE = BLOCKS.register("green_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> YELLOW_GEM_ORE = BLOCKS.register("yellow_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> ORANGE_GEM_ORE = BLOCKS.register("orange_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> RED_GEM_ORE = BLOCKS.register("red_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> RAINBOW_GEM_ORE = BLOCKS.register("rainbow_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> BLACK_GEM_ORE = BLOCKS.register("black_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> WHITE_GEM_ORE = BLOCKS.register("white_gem_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	
}
