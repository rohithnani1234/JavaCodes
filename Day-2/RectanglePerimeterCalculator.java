public class RectanglePerimeterCalculator{
	public static void calculatePerimeter(double length,double breadth){
		double result=2*(length+breadth);
		System.out.println("Perimeter of Rectangle is:"+result);
	}
	public static void main(String[] args){
		calculatePerimeter(6,7);
	}
}