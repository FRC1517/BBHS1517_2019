/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1517.robot;

import edu.wpi.first.wpilibj.XboxController;
import org.usfirst.frc.team1517.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public XboxController xbox;
	public XboxController xbox2;
	public XboxController xbox3;

    public OI() {
    	xbox = new XboxController(RobotMap.xboxController);
		xbox2 = new XboxController(RobotMap.xboxController2);
		xbox3 = new XboxController(RobotMap.xboxController3);
		System.out.println("OI constructer " ); 
		//xbox2.whenPressed(new PistonUp());
		//xbox2.whenPressed(new PistonDown());

    }
    public XboxController getXbox() {
        return xbox;
    }	
    public XboxController getXbox2() {
        return xbox2;
	}
	public XboxController getXbox3() {
		return xbox3;
	}
	
}
