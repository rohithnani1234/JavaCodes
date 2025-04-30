public class Game{
	public static void main(String[] args){
		showGameTitle();
		showGameRules();
		showLoadingScreen();
	}
	public static void showGameTitle(){
		System.out.println("Welcome to Adventure Quest!");
	}
	public static void showGameRules(){
		System.out.println("Rules:");
		System.out.println("1. Collect Coins");
		System.out.println("2. Avoid obstacles");
		System.out.println("3. Reach the goal");
	}
	public static void showLoadingScreen(){
		System.out.println("Loading game... Please wait");
	}
}