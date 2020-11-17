/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.SparkMax;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
    private TalonSRX leftFollower;
    private TalonSRX leftLeader;
    private TalonSRX rightFollower;
    private TalonSRX rightLeader;

  public DriveTrain() {
    leftFollower = new TalonSRX(Constants.kleftFollower);
    leftLeader = new TalonSRX(Constants.kleftLeader);
    rightFollower = new TalonSRX(Constants.krightFollower);
    rightLeader = new TalonSRX(Constants.krightLeader);

    //set motors to default
    leftFollower.configFactoryDefault();
    leftLeader.configFactoryDefault();
    rightFollower.configFactoryDefault();
    rightLeader.configFactoryDefault();
    }
    
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
