package robot;

import lib.commandbased.Scheduler;
import lib.commandbased.TimedRobot;

public class Robot extends TimedRobot 
{

	public Robot() 
	{
	  //param:AutonTime, TeleopTime
		super(10000000, 10000000);
		// TODO Auto-generated constructor stub
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void autonomousInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autonomousPeriodic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void robotInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void robotPeriodic() {
		// TODO Auto-generated method stub
		Scheduler.getInstance().run();
		
	}

	@Override
	public void teleopInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teleopPeriodic() {
		// TODO Auto-generated method stub
		Scheduler.getInstance().run();
		
	}

}
