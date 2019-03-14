//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num, den;

	//write two constructors
	public Rational(){
	}
	
	public Rational(int num1, int num2) {
		setRational(num1, num2);
	}

	//write a setRational method
	public void setRational(int num1, int num2) {
		setNumerator(num1);
		setDenominator(num2);
	}
	

	//write  a set method for numerator and denominator
	public void setNumerator(int num1) {
		num = num1;
	}
	
	public void setDenominator(int num2) {
		den = num2;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num = num * other.getDenominator() + other.getNumerator() * den;
		den = den * other.getDenominator();
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(num,den);
		num = num/gcd;
		den = den/gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for (int i = 1; i <= Math.min(num, den); i++) {
			if(num % i == 0 && den % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public Object clone()
	{
		Rational r = new Rational(num, den);
		return r;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	
	public boolean equals( Object obj)
	{
		Rational obj1 = (Rational) obj;
		if (compareTo(obj1) == -1) {
			return false;
		}
		else {
			return true;
		}
	}

	public int compareTo(Rational other)
	{
		other.reduce();
		if (num == other.getNumerator() && den == other.getDenominator()) {
			return 0;
		}
		else {
			return -1;
		}
	}



	
	//write  toString() method
	public String toString() {
		String output = num+"/"+den;
		return output;
	}
	
	
}