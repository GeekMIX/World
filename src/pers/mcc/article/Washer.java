package pers.mcc.article;

public class Washer {
    // boolean on or off
    private boolean power;
    private int waterLevel;



    //part
    private WaterPipe waterPipe;
    private Wire powerWire;


    public Washer(){
        powerWire = new Wire();
        waterPipe = new WaterPipe();
    }

    public void connect(Wire wire){
        this.powerWire = wire;
        this.power = wire.getPower();
    }

    public void start (){

        this.power = powerWire.getPower();
        if (power){
            //starting success
            System.out.println("washer power is on");
        }else{
            //startup failed
            System.out.println("washer power is not on");
        }
    }


    public WaterPipe getWaterPipe() {
        return waterPipe;
    }

    public void setWaterPipe(WaterPipe waterPipe) {
        this.waterPipe = waterPipe;
    }


    public Wire getPowerWire() {
        return powerWire;
    }
}
