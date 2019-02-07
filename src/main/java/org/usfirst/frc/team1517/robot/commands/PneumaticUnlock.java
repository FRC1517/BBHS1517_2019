/*package org.usfirst.frc.team1517.robot.commands;



import org.usfirst.frc.team1517.robot.Robot;

import org.usfirst.frc.team1517.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;



public class PneumaticUnlock extends Command {

	

	private double time;



    public PneumaticUnlock(double inputTime) {

        requires(Robot.pneumatics);

        time = inputTime;

    }



    protected void initialize() {

    	Robot.pneumatics.pneumaticUnlock();

    	RobotMap.islocked = false;

    	setTimeout(time);

    }



    protected void execute() {

    	RobotMap.islocked = false;

    	Robot.pneumatics.pneumaticUnlock(Robot.oi.getXbox3().getYButtonPressed());

    }



    protected boolean isFinished() {

    	if (time <= 0) return false;

    	else return isTimedOut();

    }



    protected void end() {

    	Robot.pneumatics.pneumaticStop();

    }



    protected void interrupted() {

    	Robot.pneumatics.pneumaticStop();

    }



	public static void whenPressed(PneumaticUnlock pneumaticUnlock) {
	}



	public static void whenReleased(PneumaticStop pneumaticStop) {
	}

}*/