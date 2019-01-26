package frc.robot;

import edu.wpi.first.wpilibj.Talon;

public class DriveSystem {
    private Talon _motorDriveFL;
    private Talon _motorDriveRL;
    private Talon _motorDriveFR;
    private Talon _motorDriveRR;

    public DriveSystem () {
        this._motorDriveFL = new Talon(SheetOfKnowledge.MOTOR_DRIVE_FL);
        this._motorDriveRL = new Talon(SheetOfKnowledge.MOTOR_DRIVE_RL);
        this._motorDriveFR = new Talon(SheetOfKnowledge.MOTOR_DRIVE_FR);
        this._motorDriveRR = new Talon(SheetOfKnowledge.MOTOR_DRIVE_RR);
    }
}