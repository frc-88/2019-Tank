/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  TalonSRX leftMaster, rightMaster;
  VictorSPX leftFollower1, leftFollower2, leftFollower3,
  rightFollower1, rightFollower2, rightFollower3;
  
  
  public Drive() {
    leftMaster = new TalonSRX(RobotMap.leftMotor);
    rightMaster = new TalonSRX(RobotMap.rightMotor);

    leftFollower1 = new VictorSPX(RobotMap.leftFollower1);
    leftFollower2= new VictorSPX(RobotMap.leftFollower2);
    leftFollower3= new VictorSPX(RobotMap.leftFollower3);
    rightFollower1= new VictorSPX(RobotMap.rightFollower1);
    rightFollower2= new VictorSPX(RobotMap.rightFollower2);
    rightFollower3= new VictorSPX(RobotMap.rightFollower3);

    leftFollower1.follow(leftMaster);
    leftFollower2.follow(leftMaster);
    leftFollower3.follow(leftMaster);
    rightFollower1.follow(rightMaster);
    rightFollower2.follow(rightMaster);
    rightFollower3.follow(rightMaster);
  }

  public void set(double left, double right) {
    leftMaster.set(ControlMode.PercentOutput, left);
    rightMaster.set(ControlMode.PercentOutput, right);

  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveCommand());
  }
}
