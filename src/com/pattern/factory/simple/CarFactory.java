package com.pattern.factory.simple;

public class CarFactory {

    public static Car getCar(String car){
        if(car.equals("tesla")){
            return new Tesla();
        }else if(car.equals("wuling")){
            return new Wuling();
        }else{
            return null;
        }
    }



}
