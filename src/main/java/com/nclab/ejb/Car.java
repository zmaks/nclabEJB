package com.nclab.ejb;


public class Car {
    private String mark;
    private  String model;
    private float timeTo100;
    private int weight;

    public Car(String mark, String model, float timeTo100, int weight){
        this.mark = mark;
        this.model = model;
        this.timeTo100 = timeTo100;
        this.weight = weight;
    }


    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public float getTimeTo100() {
        return timeTo100;
    }

    public int getWeight() {
        return weight;
    }
}
