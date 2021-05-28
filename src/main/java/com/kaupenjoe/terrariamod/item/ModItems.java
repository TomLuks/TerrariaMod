package com.kaupenjoe.terrariamod.item;

import com.kaupenjoe.terrariamod.TerrariaMod;
import com.kaupenjoe.terrariamod.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> CHLOROPHYTE_INGOT =
            Registration.ITEMS.register("chlorophyte_ingot",
                    () -> new Item(new Item.Properties().group(TerrariaMod.MOD_TAB)));




    public static final RegistryObject<Item> BURGER =
            Registration.ITEMS.register("burger",
                    () -> new Burger());

    /* TOOLS*/

    public static final RegistryObject<Item> CHLOROPHYTE_SHOVEL =
            Registration.ITEMS.register("chlorophyte_shovel",
                    () -> new ShovelItem(ModItemTier.CHLOROPHYTE, 0f, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.SHOVEL, 2)
                                    .group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> CHLOROPHYTE_SWORD =
            Registration.ITEMS.register("chlorophyte_sword",
                    () -> new SwordItem(ModItemTier.CHLOROPHYTE, 5, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> CHLOROPHYTE_PICKAXE =
            Registration.ITEMS.register("chlorophyte_pickaxe",
                    () -> new PickaxeItem(ModItemTier.CHLOROPHYTE, 0, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.PICKAXE, 2)
                                    .group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> CHLOROPHYTE_HOE =
            Registration.ITEMS.register("chlorophyte_hoe",
                    () -> new HoeItem(ModItemTier.CHLOROPHYTE, 0, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.HOE, 2)
                                    .group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> CHLOROPHYTE_AXE =
            Registration.ITEMS.register("chlorophyte_axe",
                    () -> new AxeItem(ModItemTier.CHLOROPHYTE, 4f, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.AXE, 2)
                                    .group(TerrariaMod.MOD_TAB)));


    public static void register() {
    }

    public static final RegistryObject<Item> CHLOROPHYTE_HELMET =
            Registration.ITEMS.register("chlorophyte_helmet",
                    () -> new ArmorItem(ModArmorMaterial.CHLOROPHYTE, EquipmentSlotType.HEAD,
                            new Item.Properties().group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> CHLOROPHYTE_CHESTPLATE =
            Registration.ITEMS.register("chlorophyte_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.CHLOROPHYTE, EquipmentSlotType.CHEST,
                            new Item.Properties().group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> CHLOROPHYTE_LEGGINGS =
            Registration.ITEMS.register("chlorophyte_leggings",
                    () -> new ArmorItem(ModArmorMaterial.CHLOROPHYTE, EquipmentSlotType.LEGS,
                            new Item.Properties().group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> CHLOROPHYTE_BOOTS =
            Registration.ITEMS.register("chlorophyte_boots",
                    () -> new ArmorItem(ModArmorMaterial.CHLOROPHYTE, EquipmentSlotType.FEET,
                            new Item.Properties().group(TerrariaMod.MOD_TAB)));

    public enum ModArmorMaterial implements IArmorMaterial {
        CHLOROPHYTE(420, new int[]{5, 8, 6, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
                Ingredient.fromStacks(new ItemStack(ModItems.CHLOROPHYTE_INGOT.get())),
                TerrariaMod.MOD_ID + ":chlorophyte", 2, 2.1f);


        private final int durability;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final Ingredient repairMaterial;
        private final String name;
        private final float toughness;
        private final float knockbackResistance;

        ModArmorMaterial(int durability, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
            this.durability = durability;
            this.damageReductionAmountArray = damageReductionAmountArray;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.repairMaterial = repairMaterial;
            this.name = name;
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
        }

        @Override
        public int getDurability(EquipmentSlotType equipmentSlotType) {
            return durability;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType equipmentSlotType) {
            return damageReductionAmountArray[equipmentSlotType.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public float getToughness() {
            return toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return knockbackResistance;
        }
    }

    public enum ModItemTier implements IItemTier {
        CHLOROPHYTE(2, 15, 3f, 0f, 15,
                Ingredient.fromStacks(new ItemStack(ModItems.CHLOROPHYTE_INGOT.get()))),
        ;


        private final int harvestlevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ModItemTier(int harvestlevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
            this.harvestlevel = harvestlevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }


        @Override
        public int getMaxUses() {
            return maxUses;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestlevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }

    }


}



