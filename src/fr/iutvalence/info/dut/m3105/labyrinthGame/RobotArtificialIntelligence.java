package fr.iutvalence.info.dut.m3105.labyrinthGame;

public abstract class RobotArtificialIntelligence
{
	public static String DBAI = "DumbBoArtificialIntelligence";
	public static String LDBAI = "LesserDumbBoArtificialIntelligence";
	
	/**
	 * callback method used to get the action the robot wish to perform
	 */
	public abstract Action getAction();

	/**
	 * callback method used to notify scan result (if robot last action type was SCAN)
	 */
	public abstract void notifyScanResult(int distancesToWallsInEachDirection);

	/**
	 * callback method used  to notify move result (if robot last action type was MOVE_FORWARD)
	 */
	public abstract void notifyMoveResult(boolean hasMoved);
	
	public RobotArtificialIntelligence makeRobotArtificialIntelligence(String typeRobot)
	{
		/*switch (typeRobot)
		{
			case DBAI:
				return new DumbBotArtificialIntelligence();
			case LDBAI:
				return new LesserDumbBotArtificialIntelligence();
		}*/
	}
}