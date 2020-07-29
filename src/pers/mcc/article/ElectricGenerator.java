package pers.mcc.article;

public class ElectricGenerator {


    private boolean start;

    private Wire wire;

    public ElectricGenerator(){}
    public ElectricGenerator(Wire wire){
        this.wire = wire;
    }
    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }


    public void run(){
        if (start){
            System.out.println("electric generator running ");
           wire.setPower(true);
        }
    }

    public Wire getWire() {
        return wire;
    }

    public void setWire(Wire wire) {
        this.wire = wire;
    }
}
