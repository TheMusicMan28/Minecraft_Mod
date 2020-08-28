package com.themusicman28.lemonmod.util;

import com.themusicman28.lemonmod.Lemon;
import com.themusicman28.lemonmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Lemon.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Lemon.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> BLOCK_OF_LEMON = BLOCKS.register("block_of_lemon", BlockOfLemon::new);

    // Block Items

}
