package commands;

import lib.commandbased.Command;
import lib.util.ConsoleReader;
import robot.RobotMap;
import subsystems.Drivetrain;

public class DriveWithVelocityKeyboard extends Command
{
	private double prevTurn;
	private double prevSpeed;
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() 
	{
		double speed;
		double turn;
		
		String value = ConsoleReader.getValue();
		if(value.equals(RobotMap.DRIVE_FORWARD_KEY))
		{
			System.out.println("Forward Commmand Running");
			speed = 1;
			turn = 0;
			
		}
		else if (value.equals(RobotMap.DRIVE_BACKWARDS_KEY))
		{
			System.out.println("Back Commmand Running");
			speed = -1;
			turn = 0;
			
		}
		else if (value.equals(RobotMap.DRIVE_LEFT_KEY))
		{
			System.out.println("Left Commmand Running");
			speed = 0;
			turn = -1;
			
		}
		else if(value.equals(RobotMap.DRIVE_RIGHT_KEY))
		{
			System.out.println("Right Commmand Running");
			speed = 0;
			turn = 1;
			
		}
		else if(value.equals(RobotMap.STOP_KEY))
		{
			speed = turn = 0;
			
		}
		
		else
		{
			speed = prevSpeed;
			turn = prevTurn;
		}
		
		
		Drivetrain.getInstance().arcadeDrivePercentOutput(speed, turn);
		prevSpeed = speed;
		prevTurn = turn;
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
