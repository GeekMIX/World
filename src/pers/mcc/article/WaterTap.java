package pers.mcc.article;

public class WaterTap {



    private WaterPipe waterPipe;
    private boolean water;
    private boolean onOff;

    public WaterTap(WaterPipe waterPipe ){
        this.waterPipe = waterPipe;
    }

    public WaterTap() {

    }


    public void connect(WaterPipe waterPipe){
        this.waterPipe = waterPipe;
    }
    public void setOnOff(boolean onOff) {
        this.onOff = onOff;

        if (onOff){
            water = true;
        }else{
            water = false;
        }

        waterPipe.setWater(water);
    }

    public boolean isWater() {
        return water;
    }

}
