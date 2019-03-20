//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit12-Assignments\\words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] ray = new Word[size];
		
		for (int i = 0; i < size; i++) {
			Word a = new Word(file.nextLine());
			ray[i] = a;
		}
		
		System.out.println(Arrays.toString(ray));
		
		Arrays.sort(ray);
		
		System.out.println(Arrays.toString(ray));
		
		
	}
}