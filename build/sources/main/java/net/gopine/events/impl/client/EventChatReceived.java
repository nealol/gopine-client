package net.gopine.events.impl.client;

import net.gopine.events.Event;
import net.minecraft.util.IChatComponent;

/**
 * Called when the player receives a message in the chat.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
public class EventChatReceived extends Event {

    public final IChatComponent chatComponent;

    public EventChatReceived(IChatComponent chatComponent) {
        this.chatComponent = chatComponent;
    }

}