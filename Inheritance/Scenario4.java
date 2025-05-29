package com.secnarios;

public class Scenario4 {
	public static void main(String[] args) {
		Animal mammal=new Mammal("Lion", "Savannah", true);
		mammal.displayHabitat();
		((Mammal)mammal).displayMammalInfo();
		Animal bird=new Bird("Eagle", "Forest", true);
		bird.displayHabitat();
		((Bird)bird).displayBirdInfo();
		Animal reptile=new Reptile("Snake", "Desert", true);
		reptile.displayHabitat();
		((Reptile)reptile).displayReptileInfo();
	}
}
class Animal{
	String name;
	String habitat;
	public void displayHabitat() {
		System.out.println("Habitat: "+habitat);
	}
}
class Mammal extends Animal{
	boolean isWarmBlooded;
	public Mammal(String name,String habitat,boolean isWarmBlooded) {
		this.name=name;
		this.habitat=habitat;
		this.isWarmBlooded=isWarmBlooded;
	}
	public void displayMammalInfo() {
		//System.out.println("Habitat:"+habitat);
		if (isWarmBlooded==true) {
			System.out.println("isWarmBlooded:"+true);
		} else {
			System.out.println("isWarmBlooded:"+false);
		}
	}
}
class Bird extends Animal{
	boolean canFly;
	public Bird(String name,String habitat,boolean canFly) {
		this.name=name;
		this.habitat=habitat;
		this.canFly=canFly;
	}
	public void displayBirdInfo() {
		//System.out.println("Habitat"+habitat);
		if(canFly==true) {
			System.out.println("Can fly:"+true);
		} else {
			System.out.println("Can fly:"+false);
		}
	}
}
class Reptile extends Animal{
	boolean isColdBlooded;
	public Reptile(String name,String habitat,boolean isColdBlooded) {
		this.name=name;
		this.habitat=habitat;
		this.isColdBlooded=isColdBlooded;
	}
	public void displayReptileInfo() {
		//System.out.println("Habitat:"+habitat);
		if(isColdBlooded==true) {
			System.out.println("Is cold blooded:"+true);
		} else {
			System.out.println("Is cold blooded:"+false);
		}
	}
}