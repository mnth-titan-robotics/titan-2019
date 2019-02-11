package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    private double _driveCmd;
    private double _turnCmd;
    private double _hatchCmd;
    
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
        this._hatchCmd = 0.0;

    }

    public void update() {
        this._driveCmd = this._pilotStick.getRawAxis(SheetOfKnowledge.AXIS_DRIVE);
        this._turnCmd = this._pilotStick.getRawAxis(SheetOfKnowledge.AXIS_TURN);

        boolean hatchLift = this._copilotStick.getRawButton(SheetOfKnowledge.BTN_COPILOT_LIFT);
        double hatchLower = this._copilotStick.getRawAxis(SheetOfKnowledge.AXIS_COPILOT_LOWER);
        if(hatchLift == true){
            _hatchCmd = 1.0;
        }else if(hatchLower >= 0.5){
            _hatchCmd = -1.0;
        }else{
            _hatchCmd = 0.0;
        }

    }

    public double getDriveCmd() {
        return this._driveCmd;
    }

    public double getTurnCmd() {
        return this._turnCmd;
    }

    public double getLiftCmd(){
        return this._hatchCmd;
    }
}