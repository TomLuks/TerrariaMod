package com.kaupenjoe.terrariamod.item;

import com.kaupenjoe.terrariamod.TerrariaMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Burger extends Item
{
    public Burger()
    {
        super(new Properties().group(TerrariaMod.MOD_TAB)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(1.5f)
                        .effect(() -> new EffectInstance(Effects.HASTE, 300, 1), 0.5f)
                        .build()));
    }
}
