package pers.mcc.base;

//材料的抽象，只有名字
public abstract class Material {
    private String name;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
