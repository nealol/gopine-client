package net.gopine.events.impl.gui;

import net.gopine.events.Event;
import net.minecraft.client.gui.GuiScreen;

/**
 * Called when the player switches between GuiScreens.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
public class EventGuiSwitch extends Event {

    public final GuiScreen screen;

    public EventGuiSwitch(GuiScreen screen) {
        this.screen = screen;
    }

}