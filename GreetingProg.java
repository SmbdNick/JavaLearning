import java.util.Scanner;

public class GreetingProg {
	public static void main (String[] args){
		System.out.println("Hello, World");
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number of ways to kill a \nPathfinder party: ");
		String string = s.nextLine();
		
		System.out.print("Pizda Kostyanu " + string + " sposobamy");
		System.out.println(string + " times a day i get fucking BONK to my head");
	}
}