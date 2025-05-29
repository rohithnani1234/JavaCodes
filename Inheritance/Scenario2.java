package com.secnarios;

public class Scenario2 {
	public static void main(String[] args) {
		Employee manager=new Manager("John", 50000, 1000, 5);
		System.out.println(manager.calculateAnnualSalary());
		System.out.println(((Manager)manager).calculateManagerSalary());
		Employee engineer=new Engineer("Alice", 50000, 5);
		System.out.println(engineer.calculateAnnualSalary());
		System.out.println(((Engineer)engineer).calculateEngineerSalary());
		Employee salesPerson=new SalesPerson("alex", 50000, 0.5, 6);
		System.out.println(salesPerson.calculateAnnualSalary());
		System.out.println(((SalesPerson)salesPerson).calculateSalespersonSalary());
	}
}
class Employee{
	String name;
	double baseSalary;
	public double calculateAnnualSalary() {
		this.baseSalary=baseSalary*12;
		return baseSalary;
	}
}
class Manager extends Employee{
	int bonus;
	int numberOfEmployeesManaged;
	public Manager(String name,double baseSalary,int bonus,int numberOfEmployeesManaged) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.bonus=bonus;
		this.numberOfEmployeesManaged=numberOfEmployeesManaged;
	}
	public double calculateManagerSalary() {
		return baseSalary+bonus;
	}
}
class Engineer extends Employee{
	int projectCount;
	private static final double bonus_percount=1000;
	public Engineer(String name,double baseSalary,int projectCount) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.projectCount=projectCount;
	}
	public double calculateEngineerSalary() {
		return baseSalary+(projectCount*bonus_percount);
	}
}
class SalesPerson extends Employee{
	double comissionRate;
	int totalSales;
	public SalesPerson(String name,double baseSalary,double comissionRate,int totalSales) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.comissionRate=comissionRate;
		this.totalSales=totalSales;
	}
	public double calculateSalespersonSalary() {
		return baseSalary+(comissionRate*totalSales);
	}
}