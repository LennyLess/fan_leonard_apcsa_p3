//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		Dog newDog = new Dog(age, name);
		pups[spot] = newDog;
		
	}

	public String getNameOfOldest()
	{
		int maxAge = 0;
		int spot = 0;
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > maxAge) {
				maxAge = pups[i].getAge();
				spot = i;
			}
			else;
		}
		return pups[spot].getName();
	}

	public String getNameOfYoungest()
	{
		int minAge = pups[0].getAge();
		int spot = 0;
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < minAge) {
				minAge = pups[i].getAge();
				spot = i;
			}
			else;
		}
		return pups[spot].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}