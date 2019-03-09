/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1517.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	public static final int xboxController = 0;			//Drive Contoller
	public static final int xboxController2 = 1;		//
	public static final int xboxController3 = 2;
	public static final int RFTalon = 8; //right front drive motor //idk
	public static final int RBTalon = 7; //right back drive motor //idk
	public static final int LFTalon = 6; //left front drive motor
	public static final int LBTalon = 5; //left back drive motor
	public static final int GRTalon = 4; //Arm
	public static final int ARTalon = 3; //Gripper
	public static final int RITalon = 2;	//On Robot R Back
	public static final int LITalon = 1;	//On Robot R Front

	public static final int SHOOTER_PITCH_SOLENOID_DEPLOY = 0;
	public static final int SHOOTER_PITCH_SOLENOID_RETRACT = 1;

	
	public static final int PNEU_UP = 0;
	public static final int PNEU_DOWN = 7;

	public static final int PDP = 62;
	public static final int PCM = 61;
}
