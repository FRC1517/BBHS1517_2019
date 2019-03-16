package org.usfirst.frc.team1517.robot.subsystems;

import org.usfirst.frc.team1517.robot.RobotMap;
import org.usfirst.frc.team1517.robot.commands.GripperCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class GripperSubsystem extends Subsystem {

	public WPI_TalonSRX m_gripper;
	PIDController pid;
	//DifferentialDrive m_robotElevator; 

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public GripperSubsystem()
	{
		m_gripper = new WPI_TalonSRX(RobotMap.GRTalon);
		pid = new PIDController(0.7, 0, 0, new PIDSource() {
			public double pidGet() { return m_gripper.getSelectedSensorPosition(); }
			public PIDSourceType getPIDSourceType() { return PIDSourceType.kDisplacement; }
			public void setPIDSourceType(PIDSourceType notusingthis) {}
		}, m_gripper);
		pid.disable();
	}
	
	public void GripperDrive(double x)
	{
		System.out.println("gripperdrive "+ x  );
		
		m_gripper.set(x/2);
	}

	public void goToPosition(double pos) {
		pid.enable();
		pid.setSetpoint(pos);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new GripperCommand());
    }
}

