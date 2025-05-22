package thistasks;

public class Employee {
	String name;
	double salary;
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public void setSalary(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Employee name:"+name);
		System.out.println("Employee salary:"+salary);
	}
	public static void main(String[] args) {
		System.out.println("Before updatinh the result:");
		Employee e=new Employee("Rohith", 50000);
		e.display();
		System.out.println("\nAfter updating the results:");
		e.setSalary("Rohith Kumar", 75000);
		e.display();
	}
}
