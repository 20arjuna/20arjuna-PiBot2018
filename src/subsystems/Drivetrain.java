package subsystems;

import commands.DriveWithVelocity;
import commands.DriveWithVelocityKeyboard;
import commands.TimedDriveWithVelocity;
//Libraries from the raspilib.jar
import lib.commandbased.Command;
import lib.commandbased.Subsystem;
import lib.devices.TalonSRX;
import lib.devices.TalonSRX.ControlMode;
import lib.devices.TalonSRX.FeedbackDevice;
//Importing the RobotMap class from
//Package: robot
//Class: RobotMap
import robot.RobotMap;

//Drivetrain is a subsystem
public class Drivetrain extends Subsystem
{
	//instance variable of your Drivetrain
	private static Drivetrain dt;
	private TalonSRX left;
	private TalonSRX right;
	
	//constructor for the drivetrain
	//Singleton means you can only have one object in that class at a time
	//private because you don't want another class to call the drivetrain constructor
	
	private Drivetrain()
	{
		//initializing the talons based on the RobotMap constants
		left = new TalonSRX(RobotMap.LEFT_TALON_ENABLE, RobotMap.LEFT_FORWARD, RobotMap.LEFT_BACKWARD);
		right = new TalonSRX(RobotMap.RIGHT_TALON_ENABLE, RobotMap.RIGHT_FORWARD, RobotMap.RIGHT_BACKWARD);
		
		
	}
	
	//Initialize the default command 
	//Default command is the command which is run after an explicit command is called and completed
	public void initDefaultCommand() 
	{
		//setDefaultCommand sets the command to the Drivetrain
		
		 this.setDefaultCommand(new DriveWithVelocityKeyboard());
	}
	//Gets the instance of the Drivetrain
	//Call drivetrain by typing "Drivetrain.getInstance().ExampleMethodCall()
	public static Drivetrain getInstance()
	{
		if (dt == null)
		{
			dt = new Drivetrain();
		}
		return dt;
	}
	public void arcadeDrivePercentOutput(double speed, double turn)
	{
		left.set(ControlMode.PercentOutput, speed + turn);
		right.set(ControlMode.PercentOutput, speed - turn);
	}
	/**
	 * Getters and Setters for Talons
	 */
	public TalonSRX getLeftTalon()
	{
		return left;
	}
	public TalonSRX getRightTalon()
	{
		return right;
	}
	public void setLeftTalon(TalonSRX newLeftTalon)
	{
		left = newLeftTalon;
	}
	public void setRightTalon(TalonSRX newRightTalon)
	{
		right = newRightTalon;
	}
	public void talonInit()
	{
		left.setupEncoder(RobotMap.LEFT_ORANGE_PIN, RobotMap.LEFT_BROWN_PIN);
		right.setupEncoder(RobotMap.RIGHT_ORANGE_PIN, RobotMap.RIGHT_ORANGE_PIN);
		left.configSelectedFeedbackSensor(FeedbackDevice.MagneticEncoder, RobotMap.PID_PRIMARY, RobotMap.TIMEOUT);
	}
	
	

}
/*Questions from Drivetrain Class
 * 1. What is a singleton class? --> Research
 * 2. Difference between initDefaultCommand and setDefaultCommand methods
 * 3. What is the purpose of the getInstance() method 
 * 4. What is PercentOutput
 */
