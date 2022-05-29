# How to use
```
put this in Module.java
```
```java
public List<Setting> settings = new ArrayList<Setting>();

public void addSetting(Setting setting) {
        this.settings.add(setting);
}
public List<Setting> getSettings() {
    return settings;
}
```
```
To create settings, write in your module (Sprint, Fly, etc.)
```
```java
BooleanSetting bool = new BooleanSetting("Boolean", this, true); //instead boolean your setting
```
```
to make a setting in your module, make the module class constructor and add settings addSetting(nastroika):
```
```java
public Sprint() {
    addSetting(boolValue);
    addSetting(numValue);
}

```
