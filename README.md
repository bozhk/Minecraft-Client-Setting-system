# Module-settings-for-minecraft-client
put this in Module.java
public List<Setting> settings = new ArrayList<Setting>();

public void addSetting(Setting setting) {
        this.settings.add(setting);
}
public List<Setting> getSettings() {
    return settings;
}

To create settings, write in your function (Sprint, Fly, etc.)
BooleanSetting bool = new BooleanSetting("Boolean", this, true); //вместо булиан вашу настройку

to make a setting in your module, make the module class constructor and add settings addSetting(nastroika):
public Sprint() {
    addSetting(boolValue);
    addSetting(numValue);
}
