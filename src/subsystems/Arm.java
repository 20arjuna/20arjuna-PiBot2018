package subsystems;

import commands.MoveArmKeyboard;
import lib.commandbased.Subsystem;
import lib.devices.TalonSRX;
import lib.devices.TalonSRX.ControlMode;
import robot.RobotMap;

public class Arm extends Subsystem 
{
	private static Arm arm; //Main Arm static Field
	private TalonSRX armServo;//TalonSRX servo Field
	
	
	private Arm()
	{
		
		armServo = new TalonSRX(RobotMap.ARM_GPIO_PIN);
		
	}
	public void initDefaultCommand() 
	{
		 this.setDefaultCommand(new MoveArmKeyboard());
		
	}
	public static Arm getInstance()
	{
		if (arm == null)
		{
			arm = new Arm();
		}
		return arm;
	}
	public void moveArmPosition(double angle)
	{
		armServo.set(ControlMode.Position, angle);
	}
	public TalonSRX getServo()
	{
		return armServo;
	}
	public void moveArmPercentOutput(double percent)
	{
		armServo.set(ControlMode.PercentOutput, percent);
	}
	

}
