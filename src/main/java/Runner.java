package main.java;

import main.java.entity.Car;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(1, "Toyota", 2019, "black", 150000, "AA 0001 AA");
        car.print();
    }
}