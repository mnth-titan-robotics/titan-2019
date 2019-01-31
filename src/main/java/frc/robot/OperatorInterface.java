package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    /**
     * TODO:
     *  Member variables:
     *      One (1) double named _hatchLiftCmd
     *  init():
     *      initialize _hatchLiftCmd
     *  update():
     *      update _hatchLiftCmd based on two buttons on _copilotStick
     *          > you decide which button channels to use (you know where to put this information)
     *          > use this._copilotStick.getRawButton() to get the value
     *          > getRawButton returns a boolean, so you'll need to program some logic:
     *              boolean buttonOneVal <- getRawButton(buttonOne);
     *              boolean buttonTwoVal <- getRawButton(buttonTwo);
     * 
     *              if buttonOneVal AND NOT buttonTwoVal:
     *                  _hatchLiftCmd <- 1.0
     *              else if buttonTwoVal AND NOT buttonOneVal:
     *                  _hatchLiftCmd <- -1.0
     *              else:
     *                  _hatchLiftCmd <- 0.0
     * 
     *  Other tasks:
     *      create a getter method named getHatchLiftCmd() that returns the value of _hatchLiftCmd
     */


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