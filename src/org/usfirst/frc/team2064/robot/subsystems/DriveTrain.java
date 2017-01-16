package org.usfirst.frc.team2064.robot.subsystems;

import org.usfirst.frc.team2064.robot.RobotMap;
import org.usfirst.frc.team2064.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	
	Encoder encoder = new Encoder(RobotMap.ENC_ONE_P, RobotMap.ENC_ONE_S, true, EncodingType.k4X);
	RobotDrive tdrive = new RobotDrive(RobotMap.driveRight1, RobotMap.driveRight2, RobotMap.driveLeft1, RobotMap.driveLeft2);

	public DriveTrain(){
		 tdrive.setSafetyEnabled(false);
		
		 tdrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		 tdrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		 tdrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		 tdrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		 
	}
	 public void driveTrain(double leftJoy, double rightJoy) {
	     tdrive.setLeftRightMotorOutputs(leftJoy, rightJoy);
	 }
	 
	@Override
	protected void initDefaultCommand() {
		encoder.reset();
		setDefaultCommand(new DriveWithJoysticks());
	}

	public void tankDrive(Joystick leftJoy, Joystick rightJoy){
		 tdrive.tankDrive(leftJoy, rightJoy);
	 }
}

