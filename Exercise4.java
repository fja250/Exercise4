import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter any number: ");

	Double num = input.nextDouble();
	Double sqrtnum = Math.sqrt(num);

	System.out.println("Square root is: " + sqrtnum);

	}

}
