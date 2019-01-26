package frc.robot;

import edu.wpi.first.wpilibj.Talon;

public class DriveSystem {
    private Talon _motorDriveFL;
    private Talon _motorDriveRL;
    private Talon _motorDriveFR;
    private Talon _motorDriveRR;

    private double _driveCmd;
    private double _turnCmd;

    public DriveSystem() {
        this._motorDriveFL = new Talon(SheetOfKnowledge.MOTOR_DRIVE_FL);
        this._motorDriveRL = new Talon(SheetOfKnowledge.MOTOR_DRIVE_RL);
        this._motorDriveFR = new Talon(SheetOfKnowledge.MOTOR_DRIVE_FR);
        this._motorDriveRR = new Talon(SheetOfKnowledge.MOTOR_DRIVE_RR);

        this.init();
    }

    public void init() {
        this.setCmds(0.0, 0.0);
    }

    public void setCmds(double driveCmd, double turnCmd) {
        this._driveCmd = driveCmd;
        this._turnCmd = turnCmd;
    }
}