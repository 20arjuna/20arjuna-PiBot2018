package robot;

import java.awt.event.KeyEvent;

public class RobotMap 
{
	//Talons General
	
	public static final int PID_PRIMARY = 0;
	public static final int TIMEOUT = 10; 
	//Left Talons
	public static final int LEFT_TALON_ENABLE = 4;
	public static final int LEFT_FORWARD = 13;
	public static final int LEFT_BACKWARD = 16;
	public static final int LEFT_ORANGE_PIN = 0;
	public static final int LEFT_BROWN_PIN = 2;
	
	//Right Talons
	public static final int RIGHT_FORWARD = 12;
	public static final int RIGHT_BACKWARD = 14;
	public static final int RIGHT_TALON_ENABLE = 5;
	public static final int RIGHT_ORANGE_PIN = 27;
	public static final int RIGHT_BROWN_PIN = 29;
	
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
	public static final String LOW_ARM = "l";
	public static final double ARM_COMMAND_DURATION = 0.5;
	public static final double UP_ANGLE = 70;
	public static final double DOWN_ANGLE = 135;
	public static final double LOWISH_ANGLE = 100;
	public static final String KILL_ARM = "k";	
	//Claw
	public static final int CLAW_GPIO_PIN = 26;
	public static final double CLAW_COMMAND_DURATION = 3;
	public static final String CLAW_KEY_OPEN= "o";
	public static final String CLAW_KEY_CLOSE= "p";
	public static final double OPEN_CLAW_ANGLE = 0;
	public static final double CLOSE_CLAW_ANGLE = 28;
	public static final String KILL_CLAW = "i";
	
	//TimedDriving
	public static final double TIME_TO_DRIVE = 1.8 * Math.pow(10,  9); //Drive for 5 Seconds	


	

}
