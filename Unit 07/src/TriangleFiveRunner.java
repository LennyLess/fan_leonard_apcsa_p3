//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter a letter :: ");
		String letter = keyboard.next();
		char c = letter.charAt(0);
		
		out.println("Enter an amount");
		int amt = keyboard.nextInt();
		
		TriangleFive a = new TriangleFive(c, amt);
		out.print(a.toString());
   }
   
}