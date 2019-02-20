//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
		
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = amount; i > 0; i--) {
			for (int a = amount ; a > amount - i ; a--) {
				char newChar = (char)(letter + amount - a);
				for (int b = amount; b > amount - a ; b--) {
					
					output += newChar;
				}
				output += " ";
			}
			output += "\n";
		}
		return output;
	}
}