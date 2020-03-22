package com.brynnexvii.magicandgemcraft.init;

import com.brynnexvii.magicandgemcraft.MagicAndGemcraft;
import com.brynnexvii.magicandgemcraft.MagicAndGemcraft.GemcraftItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MagicAndGemcraft.MOD_ID);
	
	public static final RegistryObject<Item> AMETHYST_SHARD = ITEMS.register("amethyst_shard", () -> new Item(new Item.Properties().group(GemcraftItemGroup.instance)));

}
