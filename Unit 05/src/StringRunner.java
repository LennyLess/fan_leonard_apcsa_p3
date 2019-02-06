//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Leonard Fan
//Date -  2/5/19
//Class -APCSA
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a word :: ");
		String str = keyboard.nextLine();
		
		StringOddOrEven s = new StringOddOrEven(str);
	
		s.isEven();
		out.print(s.toString());
		
		
		
	}
}