package com.themusicman28.lemonmod.util;

import com.themusicman28.lemonmod.Lemon;
import com.themusicman28.lemonmod.blocks.BlockItemBase;
import com.themusicman28.lemonmod.blocks.LemonBlock;
import com.themusicman28.lemonmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

public class RegistryHandler  {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Lemon.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Lemon.MOD_ID);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> LEMON_BLOCK = BLOCKS.register("lemon_block", LemonBlock::new);

    // Block Items
    public static final RegistryObject<Item> LEMON_BLOCK_ITEM = ITEMS.register("lemon_block", () -> new BlockItemBase(LEMON_BLOCK.get()));

}
