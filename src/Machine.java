/**
 * The Machine class represents the set of 3 wheels on the slot machine.
 * It displays what the wheels look like, allows them to be spun (re-randomized)
 * and calculates payouts.
 * Payouts and icons for a typical machine can be found here: http://wizardofodds.com/games/slots/appendix/4/
 */
public class Machine {
	// TODO: decide which private member variables the Machine class needs and declare them here.
	
	// Note: I'm going to suggest a couple of "final" (i.e. constant)  
	//       arrays that you may find handy. The "final" keyword means
	//       that the value of these arrays won't change while the program
	//       is running.
	// Note2: There are other variables you will need, some final, some not.
	private final String[] iconNames = {"Cherry","Orange"," Bell ","Globe "," Plum ","Lemon "," Bar  "}; // feel free to change this!
	private final int[] firstWheelDistribution = {0,0,0,0,0,1,1,1,1,2,2,2,3,4,4,4,5,5,5,6};

	/**
	 * constructor - set up the Machine's variables.
	 */
	// TODO: you write the Machine's constructor.

	/**
	 * toString - display what is showing on the wheels.
	 * @return the appearance of the wheels.
	 * For example:
	 * +------+------+------+
	 * |Cherry| Bar  |Lemon |
	 * +------+------+------+
	 */
	// TODO: you write the Machine's toString method.
	
	/**
	 * spin - randomize the values shown on the wheels.
	 * Note: does not return anything, just changes member variables.
	 */
	// TODO: you write the Machine's spin method
	
	/**
	 * countIcons - counts how many cherries, how many lemons, etc. are showing.
	 * Note: does not return anything, just changes member variables
	 */
	// TODO: you write the Machine's countIcons method (optional)
	// I think you will find this helpful, but it is up to you. I suggest
	// you keep (a) private member variable(s) indicating how many of each
	// icon are currently displayed.
	// if you like, you can make this method "private" since it shouldn't
	// be called by anything but this class.
	
	/**
	 * calculatePayout - determines how many coins per deposited coin the
	 * player should receive.
	 * @return payout, a number.
	 */
	// TODO: you write the Machine's payout method.
}
