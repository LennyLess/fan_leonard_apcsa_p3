//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int l = ray.size();
		int diff = 0;
		for (int i = 0; i < l; i++) {
			if (ray.get(i) % 2 == 1){
				for (int a = i; a < l; a++) {
					if (ray.get(a) % 2 == 0) {
						diff = a - i;
					}
					else {
					}
				}
				if (diff != 0) {
					return diff;
				}
				else {
					return -1;
				}
			}
			else {
			}
		}
		return -1;
	}
}