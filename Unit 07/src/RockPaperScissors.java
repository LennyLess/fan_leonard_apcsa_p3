//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int range = 3;
		int rand = (int)(Math.random()*range);
		if (rand == 0) {
			compChoice = "R";
		}
		else if (rand == 1) {
			compChoice = "P";
		}
		else {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		if (playChoice.equals(compChoice)) {
			String winner = "!Draw Game!";
			return winner;
		}
		else if (playChoice.equals("R") && compChoice.equals("P")) {
			String winner = "!Computer wins <<Paper Covers Rock>>!";
			return winner;
		}
		else if (playChoice.equals("R") && compChoice.equals("S")){
			String winner = "!Player wins <<Rock Breaks Scissors>>!";
			return winner;
		}
		else if (playChoice.equals("P") && compChoice.equals("R")){
			String winner = "!Players wins <<Paper Covers Rock>>!";
			return winner;
		}
		else if (playChoice.equals("P") && compChoice.equals("S")){
			String winner = "!Computer wins <<Scissors Cuts Paper>>!";
			return winner;
		}
		else if (playChoice.equals("S") && compChoice.equals("P")){
			String winner = "!Player wins <<Scissors Cuts Paper>>!";
			return winner;
		}
		else{
			String winner = "!Computer wins <<Rocks Breaks Scissors>>!";
			return winner;
		}
	}

	public String toString()
	{
		String output= determineWinner();
		return output;
	}
}