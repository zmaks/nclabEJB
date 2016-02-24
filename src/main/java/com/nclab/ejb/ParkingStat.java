package com.nclab.ejb;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ParkingStat {
    public String getFastestCar(List<Car> cars){
        Car fastestCar = cars.get(0);
        for(Car car : cars){
            if(car.getTimeTo100()<fastestCar.getTimeTo100()){
                fastestCar = car;
            }
        }
        return "The fastest car is "+fastestCar.getMark()+" "+fastestCar.getModel();
    }
    public String getHeaviestCar(List<Car> cars){
        Car heaviestCar = cars.get(0);
        for(Car car : cars){
            if(car.getWeight()>heaviestCar.getWeight()){
                heaviestCar = car;
            }
        }
        return "The heaviest car is "+heaviestCar.getMark()+" "+heaviestCar.getModel();
    }
}
