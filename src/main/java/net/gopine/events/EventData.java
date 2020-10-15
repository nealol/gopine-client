package net.gopine.events;

import java.lang.reflect.Method;

/**
 * Used to detemine the data for events.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
public class EventData {

    public final Object sourceObj;
    public final Method targetMethod;
    public final byte priority;

    public EventData(Object sourceObj, Method targetMethod, byte priority) {
        this.sourceObj = sourceObj;
        this.targetMethod = targetMethod;
        this.priority = priority;
    }

}