package robot;

public class RobotMap 
{
	//Left Talons
	public static final int LEFT_TALON_ENABLE = 4;
	public static final int LEFT_FORWARD = 13;
	public static final int LEFT_BACKWARD = 16;
	
	//Right Talons
	public static final int RIGHT_FORWARD = 12;
	public static final int RIGHT_BACKWARD = 14;
	public static final int RIGHT_TALON_ENABLE = 5;
	
	//Keyboard Input Keys
	public static final String DRIVE_FORWARD_KEY = "w";
	public static final String DRIVE_BACKWARDS_KEY = "s";
	public static final String DRIVE_LEFT_KEY = "a";
	public static final String DRIVE_RIGHT_KEY = "d";
	public static final String STOP_KEY = "q";
	
	//Arm
	public static final int ARM_GPIO_PIN = 23;
	public static final String UP_ARM = "u";
	public static final String DOWN_ARM = "j";
	public static final double TIME_OUT = 0.5;
	

}
