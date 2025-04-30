public class SimpleIntrestCalculator{
	public static void calculateSimpleIntrest(double principal,double rate,double time){
		double result = (principal*rate*time)/100;
		System.out.println("Simple Intrest is:"+result);
	}
	public static void main(String[] args){
		calculateSimpleIntrest(1000,5,2);
	}
}