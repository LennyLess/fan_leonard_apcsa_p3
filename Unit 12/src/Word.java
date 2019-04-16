	//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		int num = rhs.toString().length() - word.length();
		if(num == 0) {
			num = word.compareTo(rhs.toString());
		}
		return num;
	}

	public String toString()
	{
		String output = word;
		return output;
	}
}