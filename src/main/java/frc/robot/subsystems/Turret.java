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
//import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.revrobotics.SparkMax;
import com.ctre.phoenix.motorcontrol.SensorCollection;

//import edu.wpi.first.wpilibj.Talon;
import frc.robot.Constants;

public class Turret extends SubsystemBase {

  private final TalonSRX turret;

  public Turret() {
    turret = new TalonSRX(Constants.kturret);

    // set motors to default
    turret.configFactoryDefault();

    // set motor spin direction
    turret.setInverted(false);

    // neutralMode to brake
    turret.setNeutralMode(NeutralMode.Brake);

  }

  // return the trajectory of the turret
  public int getTurret() {
    return turret.getActiveTrajectoryPosition();
  }

  // set power for motor
  public void setTurret(double power) {
    turret.set(ControlMode.PercentOutput, power);
  }

  // stops the motor
  public void stopTurret() {
    turret.set(ControlMode.PercentOutput, 0);
  }

  // set the start position
  public void setStart() {
    turret.set(ControlMode.Position, 0);

  }

  public int getAngle() {
    return turret.getSensorCollection().getAnalogInRaw();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  

}

