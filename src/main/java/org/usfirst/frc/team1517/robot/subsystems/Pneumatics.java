/*package org.usfirst.frc.team1517.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {

	DoubleSolenoid pneumaticLock = new DoubleSolenoid(2, 3);
	DoubleSolenoid pneumaticLift = new DoubleSolenoid(1, 0);
	DoubleSolenoid pneumaticRelease1 = new DoubleSolenoid(5, 4);
	DoubleSolenoid pneumaticRelease2 = new DoubleSolenoid(7, 6);

	public Pneumatics() {}

    public void initDefaultCommand() {}
  
    public void pneumaticLiftDown() {
    	pneumaticLift.set(Value.kForward);
	}

  
    public void pneumaticLiftUp() {
    	pneumaticLift.set(Value.kReverse);
	   	pneumaticRelease1.set(Value.kReverse);
    	pneumaticRelease2.set(Value.kReverse);
	}

    public void pneumaticLiftStop() {
    	//pneumaticLift.set(Value.kOff);
	}

    public void pneumaticLock() {
		pneumaticLock.set(Value.kForward);
	}

    public void pneumaticUnlock() {
    	pneumaticLock.set(Value.kReverse);
	}

    public void pneumaticStop() {
    	//pneumaticLock.set(Value.kOff);
	}

    public void pneumaticRelease() {
    	pneumaticRelease1.set(Value.kForward);
    	pneumaticRelease2.set(Value.kForward);
	}

    public void pneumaticRetract() {
    	pneumaticRelease1.set(Value.kReverse);
    	pneumaticRelease2.set(Value.kReverse);
	}

    public void pneumaticStopRelease() {
    	//pneumaticRelease1.set(Value.kOff);
    	//pneumaticRelease2.set(Value.kOff);
	}

	public void pneumaticLiftDown(boolean aButton) {
	}

	public void pneumaticLiftStop(boolean bButton) {
	}

	public void pneumaticLiftUp(boolean bButton) {
	}

	public void pneumaticLock(boolean xButton) {
	}

	public void pneumaticUnlock(boolean yButton) {
	}

}*/