/*package org.usfirst.frc.team1517.robot.commands;

import org.usfirst.frc.team1517.robot.Robot;
import org.usfirst.frc.team1517.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class PneumaticLiftDown extends Command {
	private double time;

    public PneumaticLiftDown(double inputTime) {
        requires(Robot.pneumatics);        
        time = inputTime;
    }

    protected void initialize() {
    	Robot.pneumatics.pneumaticLiftDown();
    	setTimeout(time);
    	RobotMap.isDown = false;
    }

    protected void execute() {
        Robot.pneumatics.pneumaticLiftDown(Robot.oi.getXbox3().getAButtonPressed());
    	RobotMap.isDown = false;

    }

    protected boolean isFinished() {
    	if (time <= 0) return false;
    	else return isTimedOut();
    }

    protected void end() {
    	Robot.pneumatics.pneumaticLiftDown();
    }

    protected void interrupted() {
    	Robot.pneumatics.pneumaticLiftStop();
    }

	public static void whenPressed(PneumaticLiftDown pneumaticLiftDown) {
	}

	public static void whenReleased(PneumaticLiftStop pneumaticLiftStop) {
	}

}*/