//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> Totals = new ArrayList<Integer>();
    	int sum = 0;
    	for(int row= 0; row < m.length; row++) {
    		sum = 0;
    		for (int column = 0; column < m[row].length; column++) {
    			sum += m[row][column];
    		}
    		Totals.add(sum);
    	}
		return Totals;
    }
}
