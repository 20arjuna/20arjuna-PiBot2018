package commands;

import lib.commandbased.Command;
import lib.commandbased.TimedCommand;
import robot.RobotMap;
import subsystems.Drivetrain;

public class TimedDriveWithVelocity extends Command
{
	private boolean isRunning;
	private long time;
	
	public TimedDriveWithVelocity()
	{
		requires(Drivetrain.getInstance());
	}
	protected void end() 
	{
		System.out.println("Reached end");
		
	}

	@Override
	protected void execute() 
	{
		
		
		Drivetrain.getInstance().arcadeDrivePercentOutput(1, 0);
		
		
		
	}

	@Override
	protected void initialize() {
		time = System.nanoTime();
		
	}

	@Override
	protected boolean isFinished() {
		return(System.nanoTime() - time > RobotMap.TIME_TO_DRIVE);
		
	}

	

	

	
	
}
