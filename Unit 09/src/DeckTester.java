/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		   String[] ranks = {"one", "two", "three", "four", "five", 
				   "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};   
		   String[] suits = {"clubs", "spades", "hearts", "diamonds"};    
		   int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};   
		   Deck d = new Deck(ranks, suits, pointValues);
		   
		   System.out.println(d.isEmpty());
		   System.out.println(d.size());
		  
		   System.out.println(d.toString());
		   System.out.println(d.deal());

		   while (d.isEmpty() == false) {
			   System.out.println(d.deal());
		   }
		   
		   System.out.println(d.isEmpty());
		   System.out.println(d.toString());

		   String[] ranks1 = {"ace", "two", "three"};   
		   String[] suits1 = {"heart", "diamonds"};    
		   int[] pointValues1 = {1, 2, 3};   
		   Deck d1 = new Deck(ranks1, suits1, pointValues1);
		   
		   System.out.println(d1.isEmpty());
		   System.out.println(d1.size());
		   System.out.println(d1.deal());
		   System.out.println(d1.toString());
		   
		   String[] ranks2 = {"four", "five", "six"};   
		   String[] suits2 = {"spades", "hearts"};    
		   int[] pointValues2 = {4, 5, 6};   
		   Deck d2 = new Deck(ranks2, suits2, pointValues2);
		   
		   System.out.println(d2.isEmpty());
		   System.out.println(d2.size());
		   System.out.println(d2.deal());
		   System.out.println(d2.toString());
		   
		   
	}
}
