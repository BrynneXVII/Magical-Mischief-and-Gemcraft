package com.brynnexvii.magicandgemcraft.init;

import com.brynnexvii.magicandgemcraft.MagicAndGemcraft;
import com.brynnexvii.magicandgemcraft.MagicAndGemcraft.GemcraftItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MagicAndGemcraft.MOD_ID, bus = Bus.MOD)
@ObjectHolder(MagicAndGemcraft.MOD_ID) 
public class ItemInit {
	public static final Item amethyst_shard = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(GemcraftItemGroup.instance)).setRegistryName("amethyst_shard"));

	}
}
