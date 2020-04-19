package pers.mcc.article;

import java.util.List;

public class Telegraph {

    private Wire wire;
    private ElectromagneticWave eWave;


    public Telegraph(){

    }
    public Telegraph(List<Voltage> voltages){

    }

    //connect medium
    public void connect(Wire wire){
        this.wire = wire;
    }
    public void connect(ElectromagneticWave eWave){
        this.eWave = eWave;
    }

    // store voltage in medium
    public void send(List<Voltage> voltages){
        if (wire!= null){
            wire.setVoltages(voltages);
        }
        if (eWave != null){
            eWave.setVoltages(voltages);
        }


    }
    //remove the voltage from the medium
    public void receive(){

        if (wire!= null){
            for (Voltage voltage:wire.getVoltages()){
                System.out.println(voltage.isHighVoltage());
            }
        }
        if (eWave != null){
            for (Voltage voltage:eWave.getVoltages()){
                System.out.println(voltage.isHighVoltage());
            }
        }

        wire = null;
        eWave = null;
    }
}
