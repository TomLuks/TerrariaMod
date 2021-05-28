package com.kaupenjoe.terrariamod.block;

import com.kaupenjoe.terrariamod.TerrariaMod;
import com.kaupenjoe.terrariamod.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final RegistryObject<Block> CHLOROPHYTE_BLOCK = register("chlorophyte_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(3f, 10f).sound(SoundType.METAL)));




    public static final RegistryObject<Block> SHROOMITE_BLOCK = register("shroomite_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(4f, 9f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CHLOROPHYTE_ORE = register("chlorophyte_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(3f, 9f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SHROOMITE = register("shroomite",
            () -> new ShroomiteShroom(AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .harvestLevel(0).hardnessAndResistance(0f, 0f).sound(SoundType.FUNGUS)));








    public static void register() { }





    private  static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(TerrariaMod.MOD_TAB)));
        return toReturn;

    }

}
