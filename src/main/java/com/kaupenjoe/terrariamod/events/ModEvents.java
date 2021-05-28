package com.kaupenjoe.terrariamod.events;

import com.kaupenjoe.terrariamod.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.potion.AttackDamageEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEvents
{
    @SubscribeEvent
    public void PoisonedEntity(AttackEntityEvent event)
    {
        if(event.getPlayer().getHeldItemMainhand().getItem() == ModItems.CHLOROPHYTE_SWORD.get())
        {
            if(event.getTarget().isAlive())
            {
                LivingEntity target = (LivingEntity)event.getTarget();
                if(target instanceof MobEntity)
                {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.POISON, 60));


                }
            }
        }

    }


}
