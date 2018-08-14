package commands;

import lib.commandbased.Command;
import subsystems.Drivetrain;

public class DriveWithVelocity extends Command
{
	private double speed;
	
	public DriveWithVelocity(double s)
	{
		
		speed = s;
		
	}
	
	@Override
	protected void end() 
	{
		
		
	}
	@Override
	protected void execute() 
	{
		Drivetrain.getInstance().arcadeDrivePercentOutput(speed, 0);
		
	}
	@Override
	protected void initialize() 
	{
		System.out.println("Initializing Command");
		 
	}
	@Override
	protected boolean isFinished() {
		
		return false;
	}
}
