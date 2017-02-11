package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.Robot;
import org.usfirst.frc.team3946.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbMotor extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public CANTalon winchMotor = new CANTalon(RobotMap.winchTalon);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void forward() {
    	winchMotor.set(CANTalon.Value.kFoward);
    
    }
	public void reverse() {
		winchMotor.set(CANTalon.Value.kReverse);
	}
}

