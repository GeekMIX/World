package pers.mcc.article;

public class Voltage {
    private boolean highVoltage;

    public Voltage(boolean highVoltage){
        this.highVoltage = highVoltage;
    }
    public boolean isHighVoltage() {
        return highVoltage;
    }

    public void setHighVoltage(boolean highVoltage) {
        this.highVoltage = highVoltage;
    }
}
