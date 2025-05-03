public class Car{
  public static void main(String[] args){
    Car car=new Car();
    car.displayDetails("Elite Motors","Tesla model S",80000);
    car.displayDetails("Elite Motors","BMW X5",75000);
  }
  public void displayDetails(String showroomName,String modelName,int price){
    System.out.println("Showroom Name: " + showroomName);
    System.out.println("Model Name: " + modelName);
    System.out.println("Price: " + price);
  }
}