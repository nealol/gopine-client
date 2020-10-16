package net.gopine.events.impl.client.settings;

import net.gopine.events.Event;
import net.gopine.settings.Setting;

/**
 * Called when a setting is toggled to disabled.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b1.0
 */
public class EventSettingDisable extends Event {

    public Setting setting;

    public EventSettingDisable(Setting setting) {
        this.setting = setting;
    }

}