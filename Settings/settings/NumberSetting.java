package prime.module.settings.settings;

import prime.module.Module;
import prime.module.settings.Setting;

public class NumberSetting extends Setting {
    public NumberSetting(String name, Module parent, double numberValue, double numberMinValue, double numberMaxValue) {
        this.name = name;
        this.parent = parent;
        this.numberValue = numberValue;
        this.numberValueMin = numberMinValue;
        this.numberValueMax = numberMaxValue;
    }

    public String getName() {
        return this.name;
    }

    public double get() {
        return this.numberValue;
    }

    public void set(double value) {
        this.numberValue = value;
    }
}
