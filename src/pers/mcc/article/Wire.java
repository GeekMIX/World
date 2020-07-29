package pers.mcc.article;

import pers.mcc.base.Line;
import pers.mcc.base.Material;

import java.util.List;

public class Wire extends Line {



    private Boolean power;
    private List<Voltage> voltages;
    public Wire() {
    }



    public Wire(double length, double diameter, Material material){
        setLength(length);
        setDiameter(diameter);
        setMaterial(material);
    }

    public List<Voltage> getVoltages() {
        return voltages;
    }

    public void setVoltages(List<Voltage> voltages) {
        this.voltages = voltages;
    }

    public Boolean getPower() {
        return power;
    }
    public void setPower(Boolean power) {
        this.power = power;
    }

}
