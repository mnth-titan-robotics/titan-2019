package frc.robot;

import edu.wpi.first.wpilibj.Talon;

public class DriveSystem {
    private Talon _motorDriveFL;

    public DriveSystem () {
        this._motorDriveFL = new Talon(SheetOfKnowledge.MOTOR_DRIVE_FL);
    }
}