package net.gopine.events;

/**
 * A different variation of {@link Event} which can be cancelled at call.
 * @author MatthewTGM | MatthewTGM#4058
 * @since 0.1b
 */
public class EventCancellable extends Event {

    private boolean eventCancelled = false;

    public boolean isCancelled() {
        return eventCancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.eventCancelled = cancelled;
    }
}