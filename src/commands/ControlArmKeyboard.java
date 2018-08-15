package commands;


import lib.commandbased.TimedCommand;
import lib.util.ConsoleReader;
import robot.RobotMap;
import subsystems.Arm;

public class ControlArmKeyboard extends TimedCommand
{
	public ControlArmKeyboard() 
	{
		super(RobotMap.TIME_OUT);
		
	}


	private double prevAngle;
	
	protected void end() 
	{
		
	}

	
	protected void execute() 
	{
		double angle;
		String value = ConsoleReader.getValue();
		if(value.equals(RobotMap.UP_ARM))
		{
			//Arm.getInstance().moveArmPosition(180);
			angle = 180;
		}
		else if(value.equals(RobotMap.DOWN_ARM))
		{
			
			angle = 0;
		}
		else
		{
			angle = prevAngle;
		}
		Arm.getInstance().moveArmPosition(angle);
		
	}

	protected void postInitialize() 
	{
		
		
	}

}
