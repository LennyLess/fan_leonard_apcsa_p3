//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	private String name = "";
	private int size = 0;

	//add a constructor
	public Skeleton() {
		
	}
	
	public Skeleton(String n, int s) {
		setVar(n, s);
	}

	public void setVar(String n, int s) {
		name = n;
		size = s;
	}
	
	//add code to implement the Monster interface
	
	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		if (size > other.getHowBig()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		if (size < other.getHowBig()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		if (name.equals(other.getName())) {
			return true;
		}
		return false;
	}
	

	

	//add a toString
	
	public String toString(Monster other) {
		String output = "";
		output += "Monster 1 - " + name + " " + size + "\n" + "Monster 2 - " + other.getName() + " " + other.getHowBig() + "\n \n";
		
		if (isBigger(other)) {
			output += "Monster one is bigger than monster two";
		}
		else if(isSmaller(other)) {
			output += "Monster one is smaller than monster two";
		}
		else {
			output += "Monster one is the same size as monster two";
		}
		output += "\n";
		if (namesTheSame(other)) {
			output += "Monster one has the same name as monster two";
		}
		else {
			output += "Monster one does not have the same name as monster two";
		}
		
		return output;
	}
}