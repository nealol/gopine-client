package net.gopine.events.impl.player.input;

import net.gopine.events.Event;

/**
 * Called when the player presses a key on the keyboard.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
public class EventKeyboardKeyPressed extends Event {

    public final boolean repeatedKeyBool;
    public final int keyCode;

    public EventKeyboardKeyPressed(boolean repeatedKeyBool, int keyCode) {
        this.repeatedKeyBool = repeatedKeyBool;
        this.keyCode = keyCode;
    }

}