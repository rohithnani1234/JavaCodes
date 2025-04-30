public class TimeConverter{
	public static int hoursToMinutes(int hours){
		return hours*60;
	}
	public static void main(String[] args){
		System.out.println(TimeConverter.hoursToMinutes(2));
	}
}