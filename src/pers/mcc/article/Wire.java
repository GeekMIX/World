package pers.mcc.article;

import pers.mcc.base.Line;
import pers.mcc.base.Material;

public class Wire extends Line {

    public boolean voltage;
    public Wire() {
    }
    public Wire(double length, double diameter, Material material){
        setLength(length);
        setDiameter(diameter);
        setMaterial(material);
    }

    public boolean isVoltage() {
        return voltage;
    }

    public void setVoltage(boolean voltage) {
        this.voltage = voltage;
    }
}
