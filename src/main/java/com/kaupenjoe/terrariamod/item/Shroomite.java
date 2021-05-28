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

public class Shroomite extends Item
{
    public static final RegistryObject<Item> SHROOMITE_INGOT =
            Registration.ITEMS.register("shroomite_ingot",
                    () -> new Item(new Item.Properties().group(TerrariaMod.MOD_TAB)));


    public static final RegistryObject<Item> SHROOMITE_SHOVEL =
            Registration.ITEMS.register("shroomite_shovel",
                    () -> new ShovelItem(ShroomiteItemTier.Shroomite, 0f, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(250)
                                    .addToolType(ToolType.SHOVEL, 2)
                                    .group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> SHROOMITE_SWORD =
            Registration.ITEMS.register("shroomite_sword",
                    () -> new SwordItem(ShroomiteItemTier.Shroomite, 5, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(250)
                                    .group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> SHROOMITE_PICKAXE =
            Registration.ITEMS.register("shroomite_pickaxe",
                    () -> new PickaxeItem(ShroomiteItemTier.Shroomite, 0, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(250)
                                    .addToolType(ToolType.PICKAXE, 2)
                                    .group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> SHROOMITE_HOE =
            Registration.ITEMS.register("shroomite_hoe",
                    () -> new HoeItem(ShroomiteItemTier.Shroomite, 0, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(250)
                                    .addToolType(ToolType.HOE, 2)
                                    .group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> SHROOMITE_AXE =
            Registration.ITEMS.register("shroomite_axe",
                    () -> new AxeItem(ShroomiteItemTier.Shroomite, 4f, 2f,
                            new Item.Properties()
                                    .defaultMaxDamage(250)
                                    .addToolType(ToolType.AXE, 2)
                                    .group(TerrariaMod.MOD_TAB)));

    public Shroomite(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    public enum ShroomiteItemTier implements IItemTier {
        Shroomite(4, 20, 4f, 0f, 20,
                Ingredient.fromStacks(new ItemStack(SHROOMITE_INGOT.get())));


        private final int harvestlevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ShroomiteItemTier(int harvestlevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
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

    public static final RegistryObject<Item> SHROOMITE_HELMET =
            Registration.ITEMS.register("shroomite_helmet",
                    () -> new ArmorItem(ShroomiteArmorMat.Shroomite, EquipmentSlotType.HEAD,
                            new Item.Properties().group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> SHROOMITE_CHESTPLATE =
            Registration.ITEMS.register("shroomite_chestplate",
                    () -> new ArmorItem(ShroomiteArmorMat.Shroomite, EquipmentSlotType.CHEST,
                            new Item.Properties().group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> SHROOMITE_LEGGINGS =
            Registration.ITEMS.register("shroomite_leggings",
                    () -> new ArmorItem(ShroomiteArmorMat.Shroomite, EquipmentSlotType.LEGS,
                            new Item.Properties().group(TerrariaMod.MOD_TAB)));

    public static final RegistryObject<Item> SHROOMITE_BOOTS =
            Registration.ITEMS.register("shroomite_boots",
                    () -> new ArmorItem(ShroomiteArmorMat.Shroomite, EquipmentSlotType.FEET,
                            new Item.Properties().group(TerrariaMod.MOD_TAB)));

    public enum ShroomiteArmorMat implements IArmorMaterial {
        Shroomite(500, new int[]{8, 10, 9, 7}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                Ingredient.fromStacks(new ItemStack(com.kaupenjoe.terrariamod.item.Shroomite.SHROOMITE_INGOT.get())),
                TerrariaMod.MOD_ID + ":shroomite", 4, 2.5f);

        private final int durability;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final Ingredient repairMaterial;
        private final String name;
        private final float toughness;
        private final float knockbackResistance;

        ShroomiteArmorMat(int durability, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
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

}
