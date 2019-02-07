package org.usfirst.frc.team1517.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1517.robot.RobotMap;
import org.usfirst.frc.team1517.robot.commands.*;

public class LiftSubsystem extends Subsystem { 
    Solenoid UpValve;
    Solenoid DownValve;

    public LiftSubsystem() {
        Solenoid m_UpValve = new Solenoid(RobotMap.PNEU_UP);
        Solenoid m_DownValve = new Solenoid(RobotMap.PNEU_DOWN);
    }

    public void LiftDrive(boolean x) {
        System.out.println("liftdrive "+ x  );
        Solenoid m_UpValve;
        m_UpValve.set(x);
        Solenoid m_DownValve;
        m_DownValve.set(x);
        }

    public void obey(boolean up, boolean down) {
        if (up) {
            DownValve.set(false);
            UpValve.set(true);
        } else if (down)  {
            UpValve.set(false);
            DownValve.set(false);
        } else {
            UpValve.set(false);
            DownValve.set(false);
        }

    }
    @Override
    public void initDefaultCommand(){
        setDefaultCommand(new LiftCommand());
    //coleis a master programmmer mane
    }

	public void liftDrive(double y) {
	}
}