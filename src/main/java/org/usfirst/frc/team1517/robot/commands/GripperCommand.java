package org.usfirst.frc.team1517.robot.commands;

import org.usfirst.frc.team1517.robot.Robot;
import org.usfirst.frc.team1517.robot.subsystems.GripperSubsystem;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */

public class GripperCommand extends Command {

    public GripperCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.GripperSub);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
       
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (Robot.oi.getXbox2().getAButton()) { 
            Robot.GripperSub.goToPosition(-0.1); 
        }
        else if (Robot.oi.getXbox2().getBButton()) { 
            Robot.GripperSub.goToPosition(.1); 
        }
        else if (Robot.oi.getXbox2().getXButton()) { 
            Robot.GripperSub.goToPosition(361); 
        }
        else if (Robot.oi.getXbox2().getYButton()) { 
            Robot.GripperSub.goToPosition(449); 
        }
        else if (Robot.oi.getXbox2().getBumper(Hand.kRight)) { 
            Robot.GripperSub.goToPosition(603); 
        }
        else { 
            Robot.GripperSub.goToPosition(0); 
        }
        Robot.GripperSub.GripperDrive(Robot.oi.getXbox2().getY(GenericHID.Hand.kRight));
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
