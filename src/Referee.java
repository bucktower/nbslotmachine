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
	public boolean endSession = false;
	public Referee()
	{
		playerMoney = 100;
		winnings = 0;
		payment = 1;
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
		if(userResponse.equals("y"))
			{
				testMech.spin();
			}
		else if(userResponse.equals("n"))
			{
				endSession = true;
			}
		else
			{
				System.out.println("Please enter y or n");
			}
		}
		System.out.println("Game Over!");
		
	}
}
