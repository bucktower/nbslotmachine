/**
 * The Referee keeps track of the slot machine, the player's cash reserves,
 * any interaction with the player and (optionally) stats about the game so
 * far.
 */
import java.util.Scanner;
public class Referee {
	// TODO: decide which private member variables the Referee should have, and declare them here.
	
	/**
	 * constructor - set up the variables for the Referee class
	 */
	// TODO: write the Referee's constructor.
	Scanner keyboardReader;
	private int playerMoney;
	private int winnings;
	private int payment;
	private String paymentName = "CHIP(S)";
	public boolean endSession = false;
	
	public Referee()
	{
		playerMoney = 100;
		winnings = 0;
		payment = 3;
	}
	
	/**
	 * playGame - the main game loop.
	 */
	public void playGame()
	{
		// TODO: write the Referee's playGame method.
		keyboardReader = new Scanner(System.in);
		Machine testMech = new Machine();
		System.out.println("Setting Up Game...");
		while (endSession == false && playerMoney > 0)
		{
			System.out.println("\nPlease press ENTER to spin the slot machine for " + payment + " " + paymentName + "!");
			String spinResponse = keyboardReader.nextLine(); // we will not judge whether it was ENTER or not -- this is just meant as a way to pause
			playerMoney -= payment;
			testMech.spin();
			winnings = testMech.calculatePayout();
			System.out.println(testMech.toString());
			if(winnings>=0)
			{
				System.out.println("You won:"+winnings+" chips");
			}
			else
			{
				System.out.println("You lost:" +winnings+ " chips");
			}
			playerMoney += winnings;
			System.out.println("You have "+playerMoney+" chips remaining.");
			System.out.println("Spin again? (y/n)");
			String userResponse = keyboardReader.nextLine();
			// toUpperCase so that we can catch y and Y, n and N
			if(userResponse.toUpperCase().equals("Y"))
				{
					testMech.spin();
					payment+= 5; // payment increases by 5 every time for some more fun & action!
				}
			else if(userResponse.toUpperCase().equals("N"))
				{
					endSession = true;
				}
			else
				{
					System.out.println("Please enter y or n");
				}
		}
		String endString = "Game Over! You ended up with " + playerMoney + " " + paymentName + ".";
		int moneyChange = playerMoney - 100;
		if(moneyChange > 0) {
			endString += "\nThat's " + moneyChange + " more " + paymentName + " than you started with!";
		} else if (moneyChange == 0) {
			endString += "\nYou broke even.";
		} else {
			endString += "\nThat's " + moneyChange * -1 + " less " + paymentName + " than you started with!";
		}
		System.out.println(endString);
		
	}
}
