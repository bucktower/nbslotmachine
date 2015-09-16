
public class SlotMachineRunner {

	public static void main(String[] args) {
		boolean testingMode = true;
		if (testingMode)
		{
			System.out.println("Start tests");
			Machine testMech = new Machine();
			testMech.spin();
			System.out.println(testMech.toString());
			System.out.println("Your winnings are: " + testMech.calculatePayout());
			System.out.println("End tests");
		}
		else
		{
			Referee ref = new Referee();
			System.out.println("Start game");
			ref.playGame();
			System.out.println("End game");
		}
		
	}

}
