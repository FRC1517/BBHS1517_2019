/*package org.usfirst.frc.team1517.robot.commands;



import org.usfirst.frc.team1517.robot.Robot;

import org.usfirst.frc.team1517.robot.RobotMap;



import edu.wpi.first.wpilibj.command.Command;



public class PneumaticLiftUp extends Command {

	

	private double time;



    public PneumaticLiftUp(double inputTime) {

        requires(Robot.pneumatics);

        time = inputTime;

    }



    protected void initialize() {

    	Robot.pneumatics.pneumaticLiftUp();

    	RobotMap.isDown = true;

    	setTimeout(time);

    }



    protected void execute() {

        Robot.pneumatics.pneumaticLiftUp(Robot.oi.getXbox3().getBButtonPressed());
        

    	RobotMap.isDown = true;

    }



    protected boolean isFinished() {

    	if (time <= 0) return false;

    	else return isTimedOut();

    }



    protected void end() {

    	Robot.pneumatics.pneumaticLiftStop();

    }



    protected void interrupted() {

    	Robot.pneumatics.pneumaticLiftStop();

    }



	public static void whenPressed(PneumaticLiftUp pneumaticLiftUp) {
	}



	public static void whenReleased(PneumaticLiftStop pneumaticLiftStop) {
	}

}*/