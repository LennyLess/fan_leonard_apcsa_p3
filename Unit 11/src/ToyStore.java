//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		int loop = 0;
		for (int i = 0; i < toys.length(); i++) {
			if (toys.substring( i , i+1 ).equals(" ")) {
				String toy = toys.substring(i - loop, i );
				int cnt = 0;
				int placement = 0;
				for (int b = 0; b < toyList.size(); b++) {
					if (toyList.get(b).getName().equals(toy)) {
						cnt++;
						placement = b;
					}
				}
				if ( cnt == 0) {
					Toy object = new Toy(toy);
					object.setCount( 1 );
					toyList.add( object );
				}
				else {
					toyList.get( placement ).setCount( toyList.get( placement ).getCount() + 1 );
					
				}
				loop = 0;
			}
			else {
				loop ++;
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		Toy a = toyList.get( toyList.indexOf(nm ));
  		return a;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy max = toyList.get(0);
  		for (int i = 0; i < toyList.size(); i++ ) {
  			if (max.getCount() > toyList.get(i).getCount()) {
  				max = toyList.get(i);
  			}
  			else;
  		}
  		String output = "max == " + max.getName();
  		return output;
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy max = toyList.get(0);
  		for (int i = 0; i < toyList.size(); i++ ) {
  			for (int a = i; a < toyList.size(); a ++) {
  				if (toyList.get(i).getCount() < toyList.get(a).getCount()) {
  					Toy temp = toyList.get(i);
  					toyList.set(i , toyList.get(a));
  					toyList.set(a , temp);
  				}
  			}
  		}
  		
  	}  
  	  
	public String toString()
	{
		sortToysByCount();
		String output = "[]\n" + toyList + "\n" + getMostFrequentToy();
	    return output;
	}
}