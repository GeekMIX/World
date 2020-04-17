package pers.mcc.test;

import pers.mcc.article.Metal;
import pers.mcc.article.Voltage;
import pers.mcc.article.Wire;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Wire wire = new Wire();
        wire.setLength(100000);
        wire.setDiameter(5);
        wire.setMaterial(Metal.copper);

        // loading voltage
        List<Voltage> voltages = new ArrayList<>();
        voltages.add(new Voltage(true));
        voltages.add(new Voltage(false));
        voltages.add(new Voltage(true));
        voltages.add(new Voltage(true));


        // reading voltage
        for (Voltage voltage:voltages){
            System.out.println(voltage.isHighVoltage());
        }





    }
}
