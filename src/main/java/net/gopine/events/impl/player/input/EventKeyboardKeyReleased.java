package net.gopine.events.impl.player.input;

import net.gopine.events.Event;

/**
 * Called when the player releases a key on the keyboard.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
public class EventKeyboardKeyReleased extends Event {

    public final boolean repeatedKeyBool;
    public final int keyCode;

    /**
     * @param repeatedKeyBool key event same as last key event.
     * @param keyCode key code for a key. Must be an integer.
     */
    public EventKeyboardKeyReleased(boolean repeatedKeyBool, int keyCode) {
        this.repeatedKeyBool = repeatedKeyBool;
        this.keyCode = keyCode;
    }

}
