package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Set;

public class LabyrinthBuilder 
{
	public int width;
	
	public int height;
	
	public Set<Position> forbiddenCellPositions;
	
	public Position exitPosition;
	
	
	public LabyrinthBuilder setWidth(int width)
	{
		this.width=width;
		return this;
	}
	
	public LabyrinthBuilder setHeight(int height)
	{
		this.height=height;
		return this;
	}
	
	public LabyrinthBuilder addForbiddenCellPositions(Position forbiddenCellPosition)
	{
		this.forbiddenCellPositions.add(forbiddenCellPosition);
		return this;
	}
	
	public LabyrinthBuilder setExitPosition(Position exitPosition)
	{
		this.exitPosition=exitPosition;
		return this;
	}
	
	public Labyrinth getLabyrinth()
	{
		return new Labyrinth(width,height, forbiddenCellPositions, exitPosition);
	}
}
