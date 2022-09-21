package main.java.entity;

public class Car {
  private int id;
  private String brand;
  private int yearOfIssue;
  private String color;
  private int cost;
  private String registrationNumber;

  public Car(int id, String brand, int yearOfIssue, String color, int cost, String registrationNumber){
    this.id = id;
    this.brand = brand;
    this.yearOfIssue = yearOfIssue;
    this.color = color;
    this.cost = cost;
    this.registrationNumber = registrationNumber;
  }

  public int getId(){
    return this.id;
  }

  public String getBrand(){
    return this.brand;
  }

  public int getYearOfIssue(){
    return this.yearOfIssue;
  }

  public String getColor(){
    return this.color;
  }

  public int getCost(){
    return this.cost;
  }

  public String getRregistrationNumber(){
    return this.registrationNumber;
  }

  public void print(){
    System.out.printf(
            "main.java.entity.Car [\nid: %d. \nbrand: %s \nyear of issue: %d \ncolor: %s \ncost: %d \nregistration number: %s \n]%n",
      this.id, this.brand, this.yearOfIssue, this.color, this.cost, this.registrationNumber
    );
  }
}
