package pers.mcc.test;

import pers.mcc.article.*;

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

        ElectromagneticWave eWave = new ElectromagneticWave();
        Telegraph t1 = new Telegraph();
        Telegraph t2 = new Telegraph();

        t1.connect(eWave);
        t1.connect(wire);
        t1.send(voltages);

        t2.connect(eWave);
        t2.connect(wire);
        t2.receive();










    }
}
