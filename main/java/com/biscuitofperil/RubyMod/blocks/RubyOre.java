package com.biscuitofperil.RubyMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block {

    public RubyOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(7.0f, 7.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .lightValue(7)
        );
    }
}