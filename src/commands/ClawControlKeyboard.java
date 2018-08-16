package commands;

import lib.commandbased.Command;
import lib.util.ConsoleReader;
import subsystems.Arm;
import subsystems.Claw;

public class ClawControlKeyboard extends Command
{
	private double prevAngle;
	private boolean alive;
	
	public ClawControlKeyboard()
	{
		alive = true;
	}

	
	protected void end() 
	{
		
		
	}

	@Override
	protected void execute() 
	{
		double angle;
		String value = ConsoleReader.getValue();
		if(value.equals(robot.RobotMap.CLAW_KEY_OPEN))
		{
			angle = robot.RobotMap.OPEN_CLAW_ANGLE;
			Claw.getInstance().moveClawPosition(angle);
			alive = true;
		}
		else if(value.equals(robot.RobotMap.CLAW_KEY_CLOSE))
		{
			angle = robot.RobotMap.CLOSE_CLAW_ANGLE;
			Claw.getInstance().moveClawPosition(angle);
			alive = true;
		}
		else if(value.equals(robot.RobotMap.KILL_CLAW))
		{
			Claw.getInstance().moveClawPercentOutput(0);
			alive = false;
			angle = prevAngle;
		}
		else
		{
			angle = prevAngle;
		}
		if(alive)
		{
			Claw.getInstance().moveClawPosition(angle);
			prevAngle = angle;
		}
		
		
	}

	@Override
	protected void initialize() 
	{
		
		
	}

	@Override
	protected boolean isFinished() 
	{
		
		return false;
	}

}
