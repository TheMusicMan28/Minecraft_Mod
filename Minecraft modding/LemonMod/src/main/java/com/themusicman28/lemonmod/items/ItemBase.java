package com.themusicman28.lemonmod.items;

import com.themusicman28.lemonmod.Lemon;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Lemon.TAB));
    }
}
