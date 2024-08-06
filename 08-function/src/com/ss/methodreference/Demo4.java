package com.ss.methodreference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {

//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                return new Car(name);
//            }
//        };

//        CarFactory cf = name -> new Car(name);

        CarFactory cf = Car::new;


        Car c1 = cf.getCar("奔驰");
        System.out.println(c1);
    }
}

interface CarFactory {
    Car getCar(String name);
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Car {
    private String name;
}