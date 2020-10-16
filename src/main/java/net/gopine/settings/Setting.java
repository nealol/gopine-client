package net.gopine.settings;

import net.gopine.events.impl.client.settings.EventSettingDisable;
import net.gopine.events.impl.client.settings.EventSettingEnable;

public abstract class Setting {

    public final String name;
    public final SettingsType type;
    public final boolean toggle;

    public Setting(String name, SettingsType type, boolean toggle) {
        this.name = name;
        this.type = type;
        this.toggle = toggle;

        if(this.toggle) {
            this.onEnable();
        } else {
            this.onDisable();
        }
    }

    public void onEnable() {
        new EventSettingEnable(this).call();
    }

    public void onDisable() {
        new EventSettingDisable(this).call();
    }

}