public class Calculator{
	public static int add(int a,int b){
		return a+b;
	}
	public static int subtract(int a,int b){
		return a-b;
	}

	public static void main(String[] args){
		System.out.println(Calculator.add(10,5));
		System.out.println(Calculator.subtract(10,5));
	}
}