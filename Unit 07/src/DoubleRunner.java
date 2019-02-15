//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first double :: ");
		double a = keyboard.nextDouble();
		
		System.out.println("Enter the second double :: ");
		double b = keyboard.nextDouble();
		
		System.out.println("Enter the third double :: ");
		double c = keyboard.nextDouble();
		
		System.out.println("Enter the fourth double :: ");
		double d = keyboard.nextDouble();
		
		BiggestDouble run = new BiggestDouble(a,b,c,d);
		
		System.out.println(run.toString());

		//add more test cases
				
	}
}