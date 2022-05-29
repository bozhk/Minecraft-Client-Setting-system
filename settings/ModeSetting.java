package prime.module.settings.settings;

import prime.module.Module;
import prime.module.settings.Setting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModeSetting extends Setting {
    int index;
    public ModeSetting(String name, Module parent, String defaultValue, String... modes) {
        this.name = name;
        this.parent = parent;
        this.modeValue = Arrays.asList(modes);
        index = modeValue.indexOf(defaultValue);
    }

    public String get() {
        return modeValue.get(index);
    }

    public boolean is(String mode) {
        return index == modeValue.indexOf(mode);
    }

    public void cycle() {
        if (index < modeValue.size()) {
            index++;
        } else {
            index = 0;
        }
    }
}
