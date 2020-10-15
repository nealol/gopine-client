package net.gopine.events;

import net.gopine.events.manager.EventManager;

import java.util.ArrayList;

/**
 * Used to create events using the {@link EventManager}
 * @author MatthewTGM | MatthewTGM#4058
 * @since 0.1b
 */
public class Event {

    public Event call() {
        final ArrayList<EventData> eventDataList = EventManager.get(this.getClass());
        if(eventDataList != null) {
            for(EventData data : eventDataList) {
                try {
                    data.targetMethod.invoke(data.sourceObj, this);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return this;
    }

}