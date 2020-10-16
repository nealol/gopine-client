package net.gopine.events.impl.client.settings;

import net.gopine.events.Event;
import net.gopine.settings.Setting;

/**
 * Calls when a setting is toggled to enabled.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b1.0
 */
public class EventSettingEnable extends Event {

    public Setting setting;

    public EventSettingEnable(Setting setting) {
        this.setting = setting;
    }

}