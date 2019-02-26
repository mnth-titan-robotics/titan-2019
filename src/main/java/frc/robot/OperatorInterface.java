package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    private double _driveCmd;
    private double _turnCmd;
    private boolean _extendCmd;
    
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
        this._extendCmd = false;
    }

    public void update() {
        this._driveCmd = this._pilotStick.getRawAxis(SheetOfKnowledge.AXIS_DRIVE);
        this._turnCmd = this._pilotStick.getRawAxis(SheetOfKnowledge.AXIS_TURN);

        double hatchVal = this._copilotStick.getRawAxis(SheetOfKnowledge.AXIS_HATCHEXTEND);
        this._extendCmd = hatchVal > 0.5;
    }

    public double getDriveCmd() {
        return this._driveCmd;
    }

    public double getTurnCmd() {
        return this._turnCmd;
    }

    public boolean getExtendCmd() {
        return this._extendCmd;
    }
}
