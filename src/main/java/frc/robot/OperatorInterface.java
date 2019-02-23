package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    private double _driveCmd;
    private double _turnCmd;
    private boolean _extendCmd;
    private boolean _retractCmd;
    
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
        this._retractCmd = false;
    }

    public void update() {
        this._driveCmd = this._pilotStick.getRawAxis(SheetOfKnowledge.AXIS_DRIVE);
        this._turnCmd = this._pilotStick.getRawAxis(SheetOfKnowledge.AXIS_TURN);

        boolean hatchExtend = this._copilotStick.getRawButton(SheetOfKnowledge.SOLENOID_EXTEND_A);
        double hatchRetract = this._copilotStick.getRawAxis(SheetOfKnowledge.SOLENOID_RETRACT_B);
        if(hatchExtend && hatchRetract < 0.5){
            _extendCmd = true;
        }else if(hatchRetract > 0.5 & hatchExtend == false){
            _retractCmd = true;
        }else{
            _extendCmd = false;
            _retractCmd = false; 
        }

    }

    public double getDriveCmd() {
        return this._driveCmd;
    }

    public double getTurnCmd() {
        return this._turnCmd;
    }

    public boolean getExtend() {
        return this._extendCmd;
    }

    public boolean getRetract() {
        return this._retractCmd;
    }
}