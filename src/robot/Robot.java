package robot;

import commands.TimedDriveWithVelocity;
import lib.commandbased.Scheduler;
import lib.commandbased.TimedRobot;
import subsystems.Arm;
import subsystems.Claw;
import subsystems.Drivetrain;

public class Robot extends TimedRobot 
{
	private Drivetrain dt;
	private Arm arm;
	private Claw claw;
	public Robot() 
	{
	  //param:AutonTime, TeleopTime
		super(15000, 135000);
		
	}

	public static void main(String[] args) 
	{
		try 
		{
			Robot r = new Robot();
			r.run();
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}

	}
	

	@Override
	public void autonomousInit() 
	{
		
		  TimedDriveWithVelocity autonCommand = new TimedDriveWithVelocity();
		  autonCommand.start();
		 
		
		
	}

	@Override
	public void autonomousPeriodic() 
	{
		
		Scheduler.getInstance().run();
	}

	@Override
	public void robotInit() {
		
		dt = Drivetrain.getInstance();
		arm = Arm.getInstance();
		claw = Claw.getInstance();
		arm.moveArmPosition(RobotMap.DOWN_ANGLE);
		claw.moveClawPosition(RobotMap.CLOSE_CLAW_ANGLE);
	}

	@Override
	public void robotPeriodic() {
		
		Scheduler.getInstance().run();
		
	}

	@Override
	public void teleopInit() 
	{
		
		
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
	}

}
