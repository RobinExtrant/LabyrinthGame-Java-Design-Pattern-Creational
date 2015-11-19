package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;

/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 */
	public static void main(String[] args) throws InvalidParameterException
	{
		Set<Position> blockPositions = new HashSet<Position>();
		blockPositions.add(new Position(2,0));
		blockPositions.add(new Position(3,0));
		blockPositions.add(new Position(0,1));
		blockPositions.add(new Position(0,2));
		blockPositions.add(new Position(1,2));
		blockPositions.add(new Position(3,2));
		blockPositions.add(new Position(3,3));
		
		try
		{
			Labyrinth labyrinth = new LabyrinthBuilder().setWidth(4).setHeight(4)
					.addForbiddenCellPositions(new Position(2,0))
					.addForbiddenCellPositions(new Position(3,0))
					.addForbiddenCellPositions(new Position(0,1))
					.setExitPosition(new Position(3,1))
					.getLabyrinth();
			
			new LabyrinthGame(labyrinth, RobotArtificialIntelligence.makeRobotArtificialIntelligence(RobotArtificialIntelligence.DBAI)).play();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		

	}
	
}
