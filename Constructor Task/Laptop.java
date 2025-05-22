package com.constructor;
import java.util.Scanner;

public class Laptop {
	String brand;
	int ramSize;
	public Laptop(String bran,int ram) {
		this.brand=bran;
		this.ramSize=ram;
	}
	public void showSpecs() {
		System.out.println("Laptop Brand:"+brand);
		System.out.println("Laptop ramsize:"+ramSize);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter brand name:\n");
		String userbrand=sc.nextLine();
		System.out.println("Enter ramsize:\n");
		int userRamSize=sc.nextInt();
		Laptop lp=new Laptop("Dell",32);
		lp.showSpecs();
		Laptop userInput=new Laptop(userbrand,userRamSize);
		userInput.showSpecs();
		sc.close();
	}

}
