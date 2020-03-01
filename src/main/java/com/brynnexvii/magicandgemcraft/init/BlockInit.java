package com.brynnexvii.magicandgemcraft.init;

import com.brynnexvii.magicandgemcraft.MagicAndGemcraft;
import com.brynnexvii.magicandgemcraft.MagicAndGemcraft.GemcraftItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MagicAndGemcraft.MOD_ID, bus = Bus.MOD)
@ObjectHolder(MagicAndGemcraft.MOD_ID)
public class BlockInit {
	public static final Block purple_gem_ore = null;
	public static final Block blue_gem_ore = null;
	public static final Block green_gem_ore = null;
	public static final Block yellow_gem_ore = null;
	public static final Block orange_gem_ore = null;
	public static final Block red_gem_ore = null;
	public static final Block rainbow_gem_ore = null;
	public static final Block white_gem_ore = null;
	public static final Block black_gem_ore = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("purple_gem_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("blue_gem_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("green_gem_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("yellow_gem_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("orange_gem_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("red_gem_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("rainbow_gem_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("white_gem_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName("black_gem_ore"));
	}//Blocks
	
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(purple_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("purple_gem_ore"));
		event.getRegistry().register(new BlockItem(blue_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("blue_gem_ore"));
		event.getRegistry().register(new BlockItem(green_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("green_gem_ore"));
		event.getRegistry().register(new BlockItem(yellow_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("yellow_gem_ore"));
		event.getRegistry().register(new BlockItem(orange_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("orange_gem_ore"));
		event.getRegistry().register(new BlockItem(red_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("red_gem_ore"));
		event.getRegistry().register(new BlockItem(rainbow_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("rainbow_gem_ore"));
		event.getRegistry().register(new BlockItem(white_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("white_gem_ore"));
		event.getRegistry().register(new BlockItem(black_gem_ore, new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("black_gem_ore"));
		
	}

}
