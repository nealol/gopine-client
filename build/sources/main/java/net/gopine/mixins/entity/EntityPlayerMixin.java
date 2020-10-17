package net.gopine.mixins.entity;

import net.gopine.events.impl.player.EventAttackEntity;
import net.gopine.events.impl.player.EventKillEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * EntityPlayer mixin class used to add events.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
@Mixin(EntityPlayer.class)
public class EntityPlayerMixin {

    /**
     * Calls the following events:
     * {@link EventAttackEntity}
     * @param targetEntity the entity being attacked.
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "attackTargetEntityWithCurrentItem", at = @At("RETURN"))
    public void attackTargetEntityWithCurrentItem(Entity targetEntity, CallbackInfo ci) {
        if(targetEntity != null) {
            new EventAttackEntity(targetEntity).call();
            if(targetEntity.isDead) {
                new EventKillEntity(targetEntity).call();
            }
        }
    }

}