package org.usfirst.frc.team1517.robot.subsystems;

import org.usfirst.frc.team1517.robot.RobotMap;
import org.usfirst.frc.team1517.robot.commands.GripperCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class GripperSubsystem extends Subsystem {

	SpeedController m_gripper; 
	//DifferentialDrive m_robotElevator; 

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public GripperSubsystem()
	{
		m_gripper = new WPI_TalonSRX(RobotMap.GRTalon);

	}
	
	public void GripperDrive(double x)
	{
		System.out.println("gripperdrive "+ x  );
		
		m_gripper.set(x);
	}

	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new GripperCommand());
    }
}

