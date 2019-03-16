package org.usfirst.frc.team1517.robot.subsystems;

import org.usfirst.frc.team1517.robot.RobotMap;
import org.usfirst.frc.team1517.robot.commands.GripperCommand;
import org.usfirst.frc.team1517.robot.commands.ArmCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class ArmSubsystem extends Subsystem {

	SpeedController m_arm; 
	//DifferentialDrive m_robotElevator; 

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public ArmSubsystem()
	{
		m_arm = new WPI_TalonSRX(RobotMap.ARTalon);

	}
	
	public void armDrive(double x)
	{
		System.out.println("armdrive "+ x);
		
		m_arm.set(x);
	}

	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArmCommand());
    }
}

