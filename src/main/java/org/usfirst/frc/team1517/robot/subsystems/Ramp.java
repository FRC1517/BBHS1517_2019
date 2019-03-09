import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
    
    DoubleSolenoid pitchSolenoid = null;

    public Ramp() {
        pitchSolenoid = new DoubleSolenoid(RobotMap.SHOOTER_PITCH_SOLENOID_DEPLOY, RobotMap.SHOOTER_PITCH_SOLENOID_RETRACT);
    }

    public void Up() {
        pitchSolenoid.set(Value.kForward);
    }

    public void Down() {
        pitchSolenoid.set(Value.kForward);
    }
}