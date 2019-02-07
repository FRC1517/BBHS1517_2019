/*package org.usfirst.frc.team1517.robot.commands;



import org.usfirst.frc.team1517.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;



public class PneumaticRelease extends Command {

	

	private double time;



    public PneumaticRelease(double inputTime) {

        requires(Robot.pneumatics);

        time = inputTime;

    }



    protected void initialize() {

    	Robot.pneumatics.pneumaticRelease();

    	setTimeout(time);

    }



    protected void execute() {

    	Robot.pneumatics.pneumaticRelease();

    }



    protected boolean isFinished() {

    	if (time <= 0) return false;

    	else return isTimedOut();

    }



    protected void end() {

    	Robot.pneumatics.pneumaticStopRelease();

    }



    protected void interrupted() {

    	Robot.pneumatics.pneumaticStopRelease();

    }

}*/