/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.revrobotics.SparkMax;

//import edu.wpi.first.wpilibj.Talon;
import frc.robot.Constants;

public class Turret extends SubsystemBase {

  private TalonSRX turret;

  public Turret() {
    turret = new TalonSRX(Constants.kturret);

    //set motors to default
    turret.configFactoryDefault();

    //neutralMode to brake
    turret.setNeutralMode(NeutralMode.Brake);

  }

  public int getTurret () {
    return turret.getActiveTrajectoryPosition();
  }


  public void stop(){
      turret.set(ControlMode.PercentOutput, 0);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setTurret(double power) {
    turret.set(ControlMode.PercentOutput, power);
  }

  public void stopTurret() {
    turret.set(ControlMode.Velocity, 0);
  }

  public void setStart() {
    turret.set(ControlMode.Position, 90);
  
  }

  public Integer getMotorPosition(){
    return turret.getActiveTrajectoryPosition();
  }
  

}

