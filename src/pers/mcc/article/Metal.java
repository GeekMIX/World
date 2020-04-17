package pers.mcc.article;

import pers.mcc.base.Material;

public class Metal extends Material {
    public static final Metal copper = new Metal("copper");
    public static final Metal iron = new Metal("iron");

    private Metal(String name){
        setName(name);
    }

}
