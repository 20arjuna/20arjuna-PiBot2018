package commands;


import lib.commandbased.Command;
import lib.util.ConsoleReader;
import robot.RobotMap;
import subsystems.Arm;

public class MoveArmKeyboard extends Command
{
	private double prevAngle;
	private boolean alive;
	
	//Default Constructor
	public MoveArmKeyboard()
	{
		
		alive = true;
	}

	@Override
	protected void end() 
	{

	}
	@Override
	protected void execute() 
	{
		double angle = RobotMap.DOWN_ANGLE;
		String value = ConsoleReader.getValue();

		if(value.equals(RobotMap.UP_ARM))
		{
			
			angle = RobotMap.UP_ANGLE;
			//Arm.getInstance().moveArmPosition(angle);
			alive = true;
		}
		else if(value.equals(RobotMap.DOWN_ARM))
		{
			
			angle = RobotMap.DOWN_ANGLE;
			//Arm.getInstance().moveArmPosition(angle);
			alive = true;
		}
		else if(value.equals(RobotMap.KILL_ARM))
		{
			Arm.getInstance().moveArmPercentOutput(0);
			alive = false;
			angle = prevAngle;
		}
		else
		{
			angle = prevAngle;
		}
		
		if(alive)
		{
			Arm.getInstance().moveArmPosition(angle);
			prevAngle = angle;
		}


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
