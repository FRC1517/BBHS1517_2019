package org.usfirst.frc.team1517.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import org.usfirst.frc.team1517.robot.Robot;
import edu.wpi.first.wpilibj.GenericHID;

/**
 * Add your docs here.
*/
public class PistonDown extends InstantCommand {
	/**
	 * Add your docs here.
	 */
	public PistonDown() {
		super();
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.m_ramp);
	}

	// Called once when the command executes
	@Override
	protected void initialize() {
		Robot.m_ramp.Down();
	}
    @Override
    protected void execute() {
		if (Robot.oi.getXbox().getBButtonPressed()) {
			Robot.m_ramp.Down();
		}
		else if (Robot.oi.getXbox().getAButtonPressed()) {
			Robot.m_ramp.Up();
		}
    }
    @Override
    protected boolean isFinished() {
        return false;
    }
}