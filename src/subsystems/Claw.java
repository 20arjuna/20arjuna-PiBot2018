package subsystems;
import commands.ClawControlKeyboard;

import lib.commandbased.Subsystem;
import lib.devices.TalonSRX;
import lib.devices.TalonSRX.ControlMode;
import robot.RobotMap;
public class Claw extends Subsystem
{
	private static Claw claw;
	private TalonSRX clawServo;
	
	private Claw()
	{
		clawServo = new TalonSRX(RobotMap.CLAW_GPIO_PIN);
	}
	public void initDefaultCommand() 
	{
		this.setDefaultCommand(new ClawControlKeyboard());
		
	}
	public static Claw getInstance()
	{
		if (claw == null)
		{
			claw = new Claw();
		}
		return claw;
	}
	public void moveClawPosition(double angle)
	{
		clawServo.set(ControlMode.Position, angle);
	}
	public void moveClawPercentOutput(double percent)
	{
		clawServo.set(ControlMode.PercentOutput, percent);
	}
	public TalonSRX getClawServo()
	{
		return clawServo;
	}
	

}
