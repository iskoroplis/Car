package main.java.controllers;

import main.java.entity.Car;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarController {
    public static List<Car> brandedCars(List<Car> cars, String brand){
        List<Car> brandedCars = new ArrayList<>();

        for (Car tempCar: cars){
            if(tempCar.getBrand().equals(brand)){
                brandedCars.add(tempCar);
            }
        }

        return brandedCars;
    }

    public static List<Car> carsByModelAndYear(List<Car> cars, String model, int yearsN){
        int currentYear = Year.now().getValue();

        List<Car> selectedCars = new ArrayList<>();

        for (Car tempCar: cars){
            if(Objects.equals(tempCar.getModel(), model) && (currentYear - tempCar.getYearOfIssue()> yearsN)) {
                selectedCars.add(tempCar);
            }
        }

        return selectedCars;
    }

    public static List<Car> carsByYearAndCost(List<Car> cars, int yearOfIssue, int cost){
        List<Car> selectedCars = new ArrayList<>();

        for (Car tempCar: cars){
            if(Objects.equals(tempCar.getYearOfIssue(), yearOfIssue) && (tempCar.getCost() > cost)) {
                selectedCars.add(tempCar);
            }
        }

        return selectedCars;
    }
}
