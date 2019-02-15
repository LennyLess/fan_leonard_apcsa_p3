//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		boolean a;
		do {
			out.print("Choose your move [R,P,S] :: ");
			String player = keyboard.next();
			
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game.toString());
			
			out.println("Do you want to play again? [Y,N]");
			String condition = keyboard.next();
			
			if (condition.equals("N")) {
				a = false;
			}
			else {
				a = true;
			}
		}while (a == true);
	}
}



