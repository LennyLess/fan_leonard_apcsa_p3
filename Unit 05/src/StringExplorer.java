/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The slow brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		int pos = sample.indexOf("slow");
		if (pos!=-1) {
			System.out.println("slow is found at position "+pos);
		}
		else {
			System.out.println("slow is not found");
		}
		//  Try other methods here:
		String example = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		boolean test = true;
		int count = 0;
		while (test == true) {
			int found = example.indexOf("the");
			if (found!= -1) {
				count++;
				example = example.substring(found+3);
			}
			else {
				test = false;
			}
		}
		System.out.println("The appears three times"  + count);

	}

}
