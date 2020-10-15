package net.gopine.events.impl.player;

import net.gopine.events.Event;
import net.minecraft.entity.Entity;

/**
 * Called when the player attacks an entity in-game.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
public class EventAttackEntity extends Event {

    public final Entity target;

    public EventAttackEntity(Entity target) {
        this.target = target;
    }

}