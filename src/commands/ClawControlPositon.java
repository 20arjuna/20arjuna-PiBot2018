package commands;

import lib.commandbased.Command;
import lib.commandbased.TimedCommand;
import subsystems.Claw;

public class ClawControlPositon extends TimedCommand
{
	private double angle;
	public ClawControlPositon(int angle) 
	{
		super(robot.RobotMap.CLAW_COMMAND_DURATION);
		this.angle = angle;
	}
	protected void end() 
	{
		
		
	}
	protected void execute() 
	{
		Claw.getInstance().moveClawPosition(angle);
		
	}
	protected void postInitialize() 
	{
		
		
	}

	
	

	
	
}
