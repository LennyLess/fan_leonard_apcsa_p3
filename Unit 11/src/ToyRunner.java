//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy a = new Toy("Banana");
		
		a.setCount(5);
		
		System.out.print(a.toString());
	}
}