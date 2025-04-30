public class CircleCalculator{
	public static double calculateArea(double radius){
		return 3.1416*radius*radius;
	}
	public static void main(String[] args){
		System.out.println(CircleCalculator.calculateArea(7));
	}
}