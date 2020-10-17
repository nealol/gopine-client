package net.gopine.events.impl.player;

import net.gopine.events.Event;
import net.minecraft.entity.Entity;

@Deprecated
public class EventKillEntity extends Event {

    @Deprecated
    public Entity target;

    @Deprecated
    public EventKillEntity(Entity target) {
        this.target = target;
    }

}