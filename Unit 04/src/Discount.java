//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Leonard Fan
//Date - 2/4/19
//Class - APCSA
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		if (bill>2000) {
			double discount = 0.15 * bill;
			bill = bill-discount;
			return bill;
		}
		else {
			return bill;
		}
	}
}