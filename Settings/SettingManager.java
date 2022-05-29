package prime.module.settings;

import prime.module.Module;

import java.util.ArrayList;
import java.util.List;

public class SettingManager {
    ArrayList<Setting> settings;

    SettingManager() {
        this.settings = new ArrayList<>();
    }

    public ArrayList<Setting> getValue() {
        return this.settings;
    }
}
