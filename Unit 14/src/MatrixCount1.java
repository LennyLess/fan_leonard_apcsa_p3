//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
    	
		int cnt = 0;
		for (int outer = 1; outer < m.length; outer++) {
			for (int inner = 0; inner < m[outer].length; inner++) {
				if ( m[outer][inner] == val) {
					cnt ++;
				}
			}
		}
		return cnt;
    }
}
