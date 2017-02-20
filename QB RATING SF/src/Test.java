
import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the player's number of pass attempts");
		double a = keyboard.nextDouble();
		
		System.out.println("Please enter the player's number of completions");
		double b = keyboard.nextDouble();
		
		System.out.println("Please enter the player's number of passing yards");
		double c = keyboard.nextDouble();
		
		System.out.println("Please enter the player's number of touchdown passes");
		double d = keyboard.nextDouble();
		
		System.out.println("Please enter the player's number of interceptions thrown");
		double e = keyboard.nextDouble();
		
		QbRating test = new QbRating(a,b,c,d,e);
		System.out.print(test.calcPassRating());
	}

}
