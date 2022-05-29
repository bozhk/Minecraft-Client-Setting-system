package prime.module.settings;

import prime.module.Module;

import java.util.List;

public class Setting {
    protected String name;
    protected Module parent;
    protected boolean boolValue;
    protected double numberValue, numberValueMin, numberValueMax;
    protected List<String> modeValue;

    public String getName() {
        return name;
    }

    public Module getParent() {
        return parent;
    }

    public boolean isBoolValue() {
        return boolValue;
    }

    public double getNumberValue() {
        return numberValue;
    }

    public double getNumberValueMin() {
        return numberValueMin;
    }

    public double getNumberValueMax() {
        return numberValueMax;
    }

    public List<String> getModeValue() {
        return modeValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public void setNumberValue(double numberValue) {
        this.numberValue = numberValue;
    }

    public void setNumberValueMin(double numberValueMin) {
        this.numberValueMin = numberValueMin;
    }

    public void setNumberValueMax(double numberValueMax) {
        this.numberValueMax = numberValueMax;
    }

    public void setModeValue(List<String> modeValue) {
        this.modeValue = modeValue;
    }
}
