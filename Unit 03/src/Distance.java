//(c) A+ Computer Science 

//www.apluscompsci.com

//Name - Leonard Fan
//Date - 2/1/19
//Class - APCSA
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,x2,y1,y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		xTwo=x2;
		yOne=y1;
		yTwo=y2;
	}

	public void calcDistance()
	{
		double xPart = (xTwo-xOne)*(xTwo-xOne);
		double yPart = (yTwo-yOne)*(yTwo-yOne);
		double part = xPart + yPart;
		distance = Math.sqrt(part);
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		out.printf("distance == %.3f\n",distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}