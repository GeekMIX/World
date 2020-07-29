package pers.mcc.test;

import pers.mcc.article.ElectricGenerator;
import pers.mcc.article.Washer;
import pers.mcc.article.WaterTap;

public class TestWasher {

    public static void main(String[] args) {
        //create a washer
        Washer washer = new Washer();
        //create a electric generator and plug in the washer power
        ElectricGenerator electricGenerator = new ElectricGenerator(washer.getPowerWire());
        //create a WaterTap and plug in the washer water pipe
        WaterTap waterTap = new WaterTap(washer.getWaterPipe());



        electricGenerator.setStart(true);
        waterTap.setOnOff(true);
        electricGenerator.run();
        washer.start();
        System.out.println("water tap will have water :" + waterTap.isWater());
        System.out.println("washer will have water :" + washer.getWaterPipe().isWater());
    }


}
