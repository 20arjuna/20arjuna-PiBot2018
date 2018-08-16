package commands;



import lib.commandbased.TimedCommand;
import subsystems.Arm;

public class MoveArmPosition extends TimedCommand
{
	private double angle;
	
	public MoveArmPosition(double angle) 
	{
		super(robot.RobotMap.ARM_COMMAND_DURATION);
		this.angle = angle;
	}
	
	protected void postInitialize() 
	{
		
		
	}
	
	protected void end() 
	{
		
		
	}
	
	protected void execute() 
	{
		Arm.getInstance().moveArmPosition(angle);
		
	}

}
