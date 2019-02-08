//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number :: ");
		int num = keyboard.nextInt();
		
		Perfect a = new Perfect(num);
		
		a.isPerfect();
		System.out.println(a.toString());
																
	}
}