package org.usfirst.frc.team1517.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1517.robot.Robot;
import edu.wpi.first.wpilibj.GenericHID;

public class LiftCommand extends Command {
    public LiftCommand () {
        requires(Robot.LiftSub);
    }
   // Called just before this Command runs the first time
   protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.LiftSub.liftDrive(Robot.oi.getXbox3().getY(GenericHID.Hand.kLeft));
        //Robot.LiftSub.LiftDrive(Robot.oi.getXbox3().getY(GenericHID.Hand.kRight));
        //Robot.Lift.obey(up, down);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
