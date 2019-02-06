//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a word :: ");
		String str1 = keyboard.nextLine();
		
		System.out.print("Enter a word :: ");
		String str2 = keyboard.nextLine();
		
		StringEquality s = new StringEquality(str1,str2);
		s.checkEquality();
		System.out.println( s.toString() ) ;
		
	}
}