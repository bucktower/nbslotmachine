/**
 * The Machine class represents the set of 3 wheels on the slot machine.
 * It displays what the wheels look like, allows them to be spun (re-randomized)
 * and calculates payouts.
 * Payouts and icons for a typical machine can be found here: http://wizardofodds.com/games/slots/appendix/4/
 */
public class Machine {
	private Wheel[] wheelCollection;
	
	// Note: I'm going to suggest a couple of "final" (i.e. constant)  
	//       arrays that you may find handy. The "final" keyword means
	//       that the value of these arrays won't change while the program
	//       is running.
	// Note2: There are other variables you will need, some final, some not.
	private final String[] iconNames = {"Cherry", "Orange"," Bell ","Globe "," Plum ","Lemon "," Bar  "}; // feel free to change this!
	private int[] iconQuantity = {0,0,0,0,0,0,0};
	
	/**
	 * constructor - set up the Machine's variables.
	 */
	public Machine() {
		wheelCollection = new Wheel[3];
		
		wheelCollection[0] = new Wheel(1);
		wheelCollection[1] = new Wheel(2);
		wheelCollection[2] = new Wheel(3);

	}

	/**
	 * toString - display what is showing on the wheels.
	 * @return the appearance of the wheels.
	 * For example:
	 * +------+------+------+
	 * |Cherry| Bar  |Lemon |
	 * +------+------+------+
	 */
	public String toString() {
		String masterString = "+------+------+------+\n|";
		
		for(Wheel newWheel: wheelCollection) {
			masterString += iconNames[newWheel.getSelection()];
			for(int i = 6 - iconNames[newWheel.getSelection()].length(); i > 0; i--) {
				masterString += " ";
			}
			masterString += "|";
		}
		masterString += "\n+------+------+------+";
		
		return masterString;
	}
	
	/**
	 * spin - randomize the values shown on the wheels.
	 * Note: does not return anything, just changes member variables.
	 */
	public void spin() {
		for(Wheel newWheel: wheelCollection) {
			newWheel.spinWheel();
		}
	}
	
	/**
	 * countIcons - counts how many cherries, how many lemons, etc. are showing.
	 * Note: does not return anything, just changes member variables
	 */
	// I think you will find this helpful, but it is up to you. I suggest
	// you keep (a) private member variable(s) indicating how many of each
	// icon are currently displayed.
	// if you like, you can make this method "private" since it shouldn't
	// be called by anything but this class.
	public void countIcons() {
		for(Wheel newWheel: wheelCollection) {
			iconQuantity[newWheel.getSelection()]++;
		}
	}
	
	/**
	 * calculatePayout - determines how many coins per deposited coin the
	 * player should receive.
	 * @return 
	 * @return payout, a number.
	 */
	public int calculatePayout() {
		countIcons();
		if(iconQuantity[3] == 3){
			// 3 globes -- 500
			return 500;
		} else if(iconQuantity[6] == 3) {
			// 3 bars -- 100
			return 100;
		} else if(iconQuantity[4] == 3) {
			// 3 plums -- 50
			return 50;
		} else if(iconQuantity[2] == 3) {
			// 3 bells -- 20
			return 20;
		} else if(iconQuantity[1] == 3) {
			// 3 bells -- 15
			return 15;
		} else if(iconQuantity[0] >= 1) {
			// cherries (any #)
			switch(iconQuantity[0]) {
				case 3:
					return 10;
				case 2:
					return 5;
				case 1:
					return 2;
				default:
					return 0;
			}
		} else {
			return 0;
		}
	}
}
