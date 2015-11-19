package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.security.InvalidParameterException;
import java.util.Set;

public class LabyrinthBuilder 
{
	public int width;
	
	public int height;
	
	public Set<Position> forbiddenCellPositions;
	
	public Position exitPosition;
	
	
	public LabyrinthBuilder setWidth(int width) throws InvalidParameterException
	{
		if(width>0)
		{
			this.width=width;
			return this;
		}
		else
			throw new InvalidParameterException("ERROR : the width must be positive");
		
	}
	
	public LabyrinthBuilder setHeight(int height) throws InvalidParameterException
	{
		if(height>0)
		{	
			this.height=height;
			return this;
		}
		else
			throw new InvalidParameterException("ERROR : the height must be positive");
	}
	
	public LabyrinthBuilder addForbiddenCellPositions(Position forbiddenCellPosition)
	{
		this.forbiddenCellPositions.add(forbiddenCellPosition);
		return this;
	}
	
	public LabyrinthBuilder setExitPosition(Position exitPosition) throws InvalidParameterException
	{
		if ((exitPosition.getX()>0) && (exitPosition.getY()>0))
		{
			this.exitPosition=exitPosition;
			return this;
		}
		else
			throw new InvalidParameterException("ERROR : the position x and y must be positive");
	}
	
	public Labyrinth getLabyrinth() throws Exception
	{
		if(true)
		{
			return new Labyrinth(width,height, forbiddenCellPositions, exitPosition);
		}
		else
			throw new Exception("ERROR");
	}
}
