//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Leonard Fan
//Date - 2/1/19

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double s = (y2-y1);
		double a = (x2-x1);
		return s/a;
	}

}