package org.usfirst.frc.team3946.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3946.robot.commands.RobotForward;
import org.usfirst.frc.team3946.robot.commands.RobotReverse;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick driveController0 = new Joystick(0);
	public Joystick driveController1 = new Joystick(1);
	Button winchbutton = new JoystickButton(driveController1, 1);
	Button winchbutton = new JoystickButton(driveContoller0, 1);

public OI() {
winchbutton.whenPressed(new RobotForward());
winchbutton.whenPressed(new RobotReverse());
}
}
