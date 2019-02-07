/*package org.usfirst.frc.team1517.robot.commands;



import org.usfirst.frc.team1517.robot.Robot;

import org.usfirst.frc.team1517.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;



public class PneumaticLock extends Command {

	

	private double time;



    public PneumaticLock(double inputTime) {

        requires(Robot.pneumatics);

        time = inputTime;

    }



    protected void initialize() {

    	Robot.pneumatics.pneumaticLock();

    	RobotMap.islocked = true;

    	setTimeout(time);

    }



    protected void execute() {

    	RobotMap.islocked = true;

    	Robot.pneumatics.pneumaticLock(Robot.oi.getXbox3().getXButtonPressed());

    }



    protected boolean isFinished() {

    	if (time <= 0) return false;

    	else return isTimedOut();

    }



    protected void end() {

    	Robot.pneumatics.pneumaticLock();

    }



    protected void interrupted() {

    	Robot.pneumatics.pneumaticStop();

    }



	public static void whenPressed(PneumaticLock pneumaticLock) {
	}



	public static void whenReleased(PneumaticStop pneumaticStop) {
	}

}*/