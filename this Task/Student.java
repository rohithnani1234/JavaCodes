package thistasks;

public class Student {
	int rollNo;
	String name;
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	public void updateDetails(String name) {
		System.out.println("Old name:"+this.name);
		this.name=name;
		System.out.println("\nNew name:"+name);
		
	}
	public void details() {
		System.out.println("Name:"+name);
		System.out.println("Roll no:"+rollNo);
	}
	public static void main(String[] args) {
		Student s=new Student(5465,"Rohith");
		s.details();
		s.updateDetails("Rohith Kumar");
		s.details();
	}
}
