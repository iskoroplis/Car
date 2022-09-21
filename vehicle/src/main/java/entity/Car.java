package main.java.entity;

public class Car {
  private int id;
  private String brand;
  private String model;
  private int yearOfIssue;
  private String color;
  private int cost;
  private String registrationNumber;

  public Car(int id, String brand, String model, int yearOfIssue, String color, int cost, String registrationNumber){
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.yearOfIssue = yearOfIssue;
    this.color = color;
    this.cost = cost;
    this.registrationNumber = registrationNumber;
  }

  public int getId(){
    return id;
  }

  public void setId(int id){
    this.id = id;
  }

  public String getBrand(){
    return brand;
  }

  public void setBrand(String brand){
    this.brand = brand;
  }

  public String getModel(){
    return model;
  }

  public void setModel(String model){
    this.model = model;
  }

  public int getYearOfIssue(){
    return yearOfIssue;
  }

  public void setYearOfIssue(int yearOfIssue){
    this.yearOfIssue = yearOfIssue;
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public int getCost(){
    return cost;
  }

  public void setCost(int cost){
    this.cost = cost;
  }

  public String getRegistrationNumber(){
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber){
    this.registrationNumber = registrationNumber;
  }

  public void print(){
    System.out.printf(
            "[\nid: %d. \nbrand: %s \nyear of issue: %d \ncolor: %s \ncost: %d \nregistration number: %s \n]%n",
      this.id, this.brand, this.yearOfIssue, this.color, this.cost, this.registrationNumber
    );
  }

  @Override
  public String toString(){
    return "Car id: " + id +
            "\tBrand: " + brand + ", " +
            "\tModel: " + model + ", " +
            "\tYear Of Issue: " + yearOfIssue + ", " +
            "\tColor: " + color + ", " +
            "\tCost: " + cost   + ", " +
            "\tRegistration number: " + registrationNumber;
  }

}
