package org.usfirst.frc.team2064.robot.commands;

import org.usfirst.frc.team2064.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoysticks extends Command {

	public DriveWithJoysticks(){
		requires(Robot.driveTrain);
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.driveTrain.tankDrive( Robot.oi.getLeftJoystick(), Robot.oi.getRightJoystick());
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
	}
	
	protected void interrupted() {
	}
}
