package com.themusicman28.lemonmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LemonBlock extends Block {

    public LemonBlock() {
        super(Block.Properties.create(Material.CACTUS).
                hardnessAndResistance(3.0f, 1.0f).
                sound(SoundType.SLIME).
                harvestTool(ToolType.SHOVEL).
                harvestLevel(0).
                lightValue(10));
    }
}
