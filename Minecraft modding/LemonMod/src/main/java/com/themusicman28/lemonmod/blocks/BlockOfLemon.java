package com.themusicman28.lemonmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockOfLemon extends Block {

    public BlockOfLemon() {
        super(Block.Properties.create(Material.SAND)
                .hardnessAndResistance(1.0f,1.0f)
                .sound(SoundType.SLIME)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL));
    }
}
