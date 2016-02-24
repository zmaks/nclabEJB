package com.nclab.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class Parking {
   private List<Car> cars;

    @PostConstruct
    private void createCars(){
        cars = new ArrayList<Car>();
        cars.add(new Car("Toyota","Camry", 8.2F, 2200));
        cars.add(new Car("BMW","x5", 6.5F, 2900));
        cars.add(new Car("Porsche","911", 3.8F, 1500));
        cars.add(new Car("LADA","Vesta", 11.2F, 1700));
        cars.add(new Car("VW","Golf", 8.7F, 1600));
    }

    public List<Car> getCars(){
        return cars;
    }
}
