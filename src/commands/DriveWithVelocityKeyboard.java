package commands;

import lib.commandbased.Command;
import lib.util.ConsoleReader;
import robot.RobotMap;
import subsystems.Drivetrain;

public class DriveWithVelocityKeyboard extends Command
{

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() 
	{
		String value = ConsoleReader.getValue();
		if(value.equals(RobotMap.DRIVE_FORWARD_KEY))
		{
			Drivetrain.getInstance().arcadeDrivePercentOutput(1, 0);
		}
		else if (value.equals(RobotMap.DRIVE_BACKWARDS_KEY))
		{
			Drivetrain.getInstance().arcadeDrivePercentOutput(-1, 0);
		}
		else if (value.equals(RobotMap.DRIVE_LEFT_KEY))
		{
			Drivetrain.getInstance().arcadeDrivePercentOutput(0, -1);
		}
		else if(value.equals(RobotMap.DRIVE_RIGHT_KEY))
		{
			Drivetrain.getInstance().arcadeDrivePercentOutput(0, 1);
		}
		else if(value.equals(RobotMap.STOP_KEY))
		{
			Drivetrain.getInstance().arcadeDrivePercentOutput(0, 0);
		}
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
