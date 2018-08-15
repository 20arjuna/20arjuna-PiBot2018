package subsystems;

import commands.DriveWithVelocityKeyboard;
import lib.commandbased.Subsystem;
import lib.devices.TalonSRX;
import lib.devices.TalonSRX.ControlMode;

public class Arm extends Subsystem 
{
	private static Arm arm; //Main Arm static Field
	private TalonSRX armServo;//TalonSRX servo Field
	private static int angle;
	
	private Arm(int startingAngle)
	{
		angle = startingAngle;
		armServo = new TalonSRX(angle);
		
	}
	public void initDefaultCommand() 
	{
		 this.setDefaultCommand(new DriveWithVelocityKeyboard());
		
	}
	public static Arm getInstance()
	{
		if (arm == null)
		{
			arm = new Arm(angle);
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
	

}
