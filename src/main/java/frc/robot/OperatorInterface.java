package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    private double _driveCmd;
    private double _turnCmd;
    
    private Joystick _pilotStick;
    private Joystick _copilotStick;

    public OperatorInterface() {
        this._pilotStick = new Joystick(SheetOfKnowledge.JOYSTICK_PILOT);
        this._copilotStick = new Joystick(SheetOfKnowledge.JOYSTICK_COPILOT);

        this.init();
    }

    public void init() {
        this._driveCmd = 0.0;
        this._turnCmd = 0.0;
    }

    public void update() {
        this._driveCmd = this._pilotStick.getRawAxis(SheetOfKnowledge.AXIS_DRIVE);
        this._turnCmd = this._pilotStick.getRawAxis(SheetOfKnowledge.AXIS_TURN);
    }

    public double getDriveCmd() {
        return this._driveCmd;
    }

    public double getTurnCmd() {
        return this._turnCmd;
    }
}