package com.xekr.ironstars.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SiliconBlock extends Block {
    public SiliconBlock() {
        super(Block.Properties
                .create(Material.IRON)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.METAL));
        this.setRegistryName("silicon_block");
    }
}
