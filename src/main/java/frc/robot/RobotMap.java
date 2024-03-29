/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
   public static final int leftMotor = 31;
   public static final int rightMotor = 32;
  public static final int leftFollower1 = 24;
  public static final int leftFollower2 = 25;
  public static final int leftFollower3 = 26;
  public static final int rightFollower1 = 21;
  public static final int rightFollower2 = 22;
  public static final int rightFollower3 = 23;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
public static final int joystick_port = 0;
public static final double deadzone = 0.1;
}
