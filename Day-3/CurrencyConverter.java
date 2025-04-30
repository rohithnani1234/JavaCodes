public class CurrencyConverter{
	public static double rupeesToUSD(double rupees){
		return rupees/83.0;
	}
	public static void main(String[] args){
		System.out.println(CurrencyConverter.rupeesToUSD(8300));
	}
}