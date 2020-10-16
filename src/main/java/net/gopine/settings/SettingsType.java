package net.gopine.settings;

public enum SettingsType {

    CHAT("CHAT"),
    GUI("GUI");

    public String type;

    SettingsType(String type) {
        this.type = type;
    }

}