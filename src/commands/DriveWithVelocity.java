package commands;

import lib.commandbased.Command;
import subsystems.Drivetrain;

public class DriveWithVelocity extends Command
{
	private double speed;
	
	public DriveWithVelocity(double s)
	{
		requires(Drivetrain.getInstance());
		speed = s;
		
	}
	@Override
	protected void end() 
	{
		//Drivetrain.getInstance().initDefaultCommand();
		
	}
	@Override
	protected void execute() 
	{
		Drivetrain.getInstance().arcadeDrivePercentOutput(speed, 0);
		
	}
	@Override
	protected void initialize() 
	{
		
		
	}
	@Override
	protected boolean isFinished() {
		
		return false;
	}
}
