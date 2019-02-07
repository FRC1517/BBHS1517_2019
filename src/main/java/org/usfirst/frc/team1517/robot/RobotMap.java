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
	public static final int xboxController = 0;
	public static final int xboxController2 = 1;
	public static final int xboxController3 = 2;
	public static final int RFTalon = 8; //right front drive motor
	public static final int RBTalon = 7; //right back drive motor
	public static final int LFTalon = 6; //left front drive motor
	public static final int LBTalon = 5; //left back drive motor
	public static final int GRTalon = 4; //gripper
	public static final int ARTalon = 3; //arm
	public static final int RITalon = 2;
	public static final int LITalon = 1;
	
	public static final int PNEU_UP = 0;
	public static final int PNEU_DOWN = 0;
	//public static double xAxisScale = 1;
	//public static double yAxisScale = 1;
	//public static double twistScale = 1;
	//public static boolean pMode = false;
	//public static boolean fMode = false; 
	//public static boolean islocked;
	//public static boolean isDown;
	//public static boolean isGearInRobot;
}
