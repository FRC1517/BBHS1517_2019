package org.usfirst.frc.team1517.robot.subsystems;

import org.usfirst.frc.team1517.robot.RobotMap;
import org.usfirst.frc.team1517.robot.commands.PistonDown;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Ramp extends Subsystem {
    
    public Solenoid UpSolenoid = null; //double solenoid doesn't work
    public Solenoid DownSolenoid = null;

    public Ramp() {
        UpSolenoid = new Solenoid(RobotMap.PCM, RobotMap.PNEU_UP);
        DownSolenoid = new Solenoid(RobotMap.PCM, RobotMap.PNEU_DOWN);
    }

    public void Up() {
        DownSolenoid.set(false);
        UpSolenoid.set(true);
    }

    public void Down() {
        UpSolenoid.set(false);
        DownSolenoid.set(true);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new PistonDown());
    }
}