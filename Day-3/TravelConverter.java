public class TravelConverter{
	public static double kmToMiles(double km){
		return km*0.621371;
	}
	public static void main(String [] args){
		System.out.println(TravelConverter.kmToMiles(10));
	}
}