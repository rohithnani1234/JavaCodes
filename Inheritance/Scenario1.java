package com.secnarios;

public class Scenario1 {
	public static void main(String[] args) {
		Vehicle car=new Car("Suzuki","Swift", 2014,4);
		car.displayInfo();
		((Car)car).displayCarInfo();
		Vehicle truck=new Truck("Mahindra", "M-87", 2009, 5);
		truck.displayInfo();
		((Truck) truck).displayTrcukInfo();
		Vehicle motorCycle=new MotorCycle("Pulsar", "P-87", 2024, true);
		motorCycle.displayInfo();
		((MotorCycle) motorCycle).displayMotorCycleInfo();
	}
}
class Vehicle{
	String make;
	String model;
	int year;
	public void displayInfo() {
		System.out.println("Make:"+make+"\tModel:"+model+"\tYear"+year);
	}
}
class Car extends Vehicle{
	int noOfDoors;
	public Car(String make,String model,int year,int noOfDoors) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.noOfDoors=noOfDoors;
	}
	public void displayCarInfo() {
		System.out.println("Numbers of Doors:"+noOfDoors);
	}
}
class Truck extends Vehicle{
	int cargoCapacity;
	public Truck(String make,String model,int year,int cargoCapacity){
		this.make=make;
		this.model=model;
		this.year=year;
		this.cargoCapacity=cargoCapacity;
	}
	public void displayTrcukInfo(){
		System.out.println("Cargo capacity:"+cargoCapacity);
	}
}
class MotorCycle extends Vehicle{
	boolean hasSideCar;
	public MotorCycle(String make,String model,int year,boolean hasSideCar) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.hasSideCar=hasSideCar;
	}
	public void displayMotorCycleInfo() {
		if (hasSideCar==true) {
			System.out.println("Has Sidecar:"+true);
		} else {
			System.out.println("Has Sidecar:"+false);
		}
	}
}
