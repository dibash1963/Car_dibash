package com.e.car_dibash;

public class CreateCar {
    private String mk, yr, color, price, engine, Answer;
    private int count;
    public CreateCar(String make, String yr, String color, String price, String engine, int count) {
        this.mk = make;
        this.yr = yr;
        this.color = color;
        this.price = price;
        this.engine = engine;
        this.count = count;
    }

    public String CreatesCar(){


        Answer= "The is Vehicle No. "+count+"\n"+" Manufacturer: "+mk+" Current Value: "+price+ " Effective engine Size: "+engine+"\n";
        return Answer;

    }
}

