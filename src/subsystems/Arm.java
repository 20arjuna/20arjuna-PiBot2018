package subsystems;

import commands.DriveWithVelocityKeyboard;
import lib.commandbased.Subsystem;
import lib.devices.TalonSRX;
import lib.devices.TalonSRX.ControlMode;

public class Arm extends Subsystem 
{
	private static Arm arm; //Main Arm static Field
	private TalonSRX armServo;//TalonSRX servo Field
	
	
	private Arm()
	{
		armServo = new TalonSRX(robot.RobotMap.ARM_GPIO_PIN);
		
	}
	public void initDefaultCommand() 
	{
		 this.setDefaultCommand(new DriveWithVelocityKeyboard());
		
	}
	public static Arm getInstance()
	{
		if (arm == null)
		{
			arm = new Arm();
		}
		return arm;
	}
	public void moveArmPosition(int angle)
	{
		armServo.set(ControlMode.Position, angle);
	}
	public TalonSRX getServo()
	{
		return armServo;
	}
	

}
