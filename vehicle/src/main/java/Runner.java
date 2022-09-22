package main.java;

import main.java.controllers.CarController;
import main.java.entity.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.*;

public class Runner {
    private static void taskA(BufferedReader reader, List<Car> cars){
        System.out.print("Enter brand you want to get cars from: ");
        try {
            String brand = reader.readLine();

            List<Car> brandedCars = CarController.brandedCars(cars, brand);

            if(brandedCars.size() == 0)
                System.out.println("There are no cars from this brand");
            else{
                System.out.println("Cars from this brand:");
                for (Car tempCar: brandedCars){
                    System.out.println(tempCar.toString());
                }
            }
        }
        catch (IOException e){
            System.out.println("Had troubles printing to the console: ");
            e.printStackTrace();
        }
    }

    public static void taskB(BufferedReader reader, List<Car> cars) throws IOException {
        System.out.print("Enter model of the car: ");
        String model = reader.readLine();

        System.out.print("Specify amount of years: ");
        int yearsN = Integer.parseInt(reader.readLine());

        List<Car> selectedCars = CarController.carsByModelAndYear(cars, model, yearsN);

        if(selectedCars.size() == 0)
            System.out.println("no car fulfils a condition");
        else {
            System.out.println("selected cars:");
            for (Car tempCar: selectedCars){
                System.out.println(tempCar.toString());
            }
        }
    }


    public static void taskC(BufferedReader reader, List<Car> cars) throws IOException {
        System.out.print("Enter year of issue of the car: ");
        int yearOfIssue = Integer.parseInt(reader.readLine());

        System.out.print("Specify price: ");
        int cost = Integer.parseInt(reader.readLine());

        List<Car> selectedCars = CarController.carsByYearAndCost(cars, yearOfIssue, cost);

        if(selectedCars.size() == 0)
            System.out.println("no car fulfils a condition");
        else {
            System.out.println("selected cars:");
            for (Car tempCar: selectedCars){
                System.out.println(tempCar.toString());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Car car = new Car(1, "Toyota", "A1", 2019, "black", 150000, "AA 0001 AA");
        Car car2 = new Car(2, "Toyota", "A2", 2015, "blue", 50000, "AM 8288 KI");
        Car car3 = new Car(3, "Bentley", "B1",2022, "white", 350000, "AE 9889 EA");
        Car car4 = new Car(4, "Toyota", "A1", 2018, "black", 120000, "AK 1209 II");
        Car car5 = new Car(5, "Mercedes", "Flex", 2015, "blue", 50000, "AM 8288 KI");
        Car car6 = new Car(6, "Mercedes", "Help", 2015, "blue", 50000, "AA 8989 KI");
        Car car7 = new Car(7, "Ford", "Flex", 2010, "black", 42000, "AE 9527 EE");
        Car car8 = new Car(8, "Ford", "Mustang", 2012, "white", 110000, "AU 7712 LH");
        Car car9 = new Car(9, "Ford", "Mustang", 2016, "blue", 98000, "AA 1231 AU");
        Car car10 = new Car(10, "Toyota", "B1", 2007, "red", 45000, "AM 1212 AM");

        List<Car> cars = Arrays.asList(car, car2, car3, car4, car5, car6, car7, car8, car9, car10);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Task a");
        taskA(reader, cars);

        System.out.println("Task b");
        taskB(reader, cars);

        System.out.println("Task c");
        taskC(reader, cars);
    }
}