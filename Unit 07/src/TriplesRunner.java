//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter a number :: ");
		int num = keyboard.nextInt();
		
		Triples a = new Triples(num);
		out.print(a.toString());
   }
}