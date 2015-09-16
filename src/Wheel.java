
public class Wheel {

	private final int[] firstWheelDistribution = {0,0,0,0,0,1,1,1,1,2,2,2,3,4,4,4,5,5,5,6};
	private final int[] secondWheelDistribution = {0,0,1,1,1,1,2,2,2,2,3,4,4,4,5,5,5,5,5,6};
	private final int[] thirdWheelDistribution = {0,0,0,1,1,1,1,2,2,2,2,3,4,5,5,5,5,5,5,6};
	private int wheelIdentity;
	private int wheelSelection;
	Wheel(int wheelID)
	{
		wheelIdentity = wheelID;
	}
	
	public void spinWheel()
	{
		// randomNum = random number
			int randomNum = (int) (Math.random()*20);
			if (wheelIdentity == 1)
			{
				wheelSelection = firstWheelDistribution[randomNum];
			}
			
			if (wheelIdentity == 2)
			{
				wheelSelection = secondWheelDistribution[randomNum];
			}
			
			if (wheelIdentity == 3)
			{
				wheelSelection = thirdWheelDistribution[randomNum];
			}
	}
	
	public int getID()
	{
		return wheelIdentity;
	}
	
	public int getSelection()
	{
		return wheelSelection;
	}
	
	
	
}
