package prime.module.settings.settings;

import prime.module.Module;
import prime.module.settings.Setting;

public class BooleanSetting extends Setting {
    public BooleanSetting(String name, Module parent, boolean value) {
        this.name = name;
        this.boolValue = value;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public boolean get() {
        return boolValue;
    }

    public void set(boolean boolSetting) {
        this.boolValue = boolSetting;
    }
}
