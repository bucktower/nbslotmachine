/**
 * The Referee keeps track of the slot machine, the player's cash reserves,
 * any interaction with the player and (optionally) stats about the game so
 * far.
 */
public class Referee {
	// TODO: decide which private member variables the Referee should have, and declare them here.
	
	/**
	 * constructor - set up the variables for the Referee class
	 */
	// TODO: write the Referee's constructor.
	private int playerMoney;
	private int winnings;
	private int payment;
	
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
		Machine testMech = new Machine();
		System.out.println("Setting Up Game...");
		while (playerMoney>0)
		{
		
		testMech.spin();
		winnings = testMech.calculatePayout() - payment;
		System.out.println(testMech.toString());
		if(winnings>=0)
		{
			System.out.println("You won:"+winnings);
		}
		else
		{
			System.out.println("You lost" +winnings);
		}
		playerMoney += winnings;
		System.out.println("You have "+playerMoney+" chips remaining.");
		}
		System.out.println("Game Over!");
		
	}
}
