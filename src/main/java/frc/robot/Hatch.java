package frc.robot;

import edu.wpi.first.wpilibj.Victor;

public class Hatch {
    /**
     * TODO:
     *  Member variables:
     *      One (1) Talon named _hatchMotor
     *      One (1) double named _liftCmd
     *  Constructor:
     *      Construct _hatchMotor to be on channel 4 (you know where to put this)
     *      initialize
     *  init():
     *      initialize _liftCmd
     *  update():
     *      set _hatchMotor based on _liftCmd
     * 
     *  Other tasks:
     *      Create a public method setLiftCmd(double liftCmd)
     */
    private Victor _hatchMotor;

    private double _liftCmd;

    public Hatch() {
        this._hatchMotor = new Victor(SheetOfKnowledge.MOTOR_HATCH);

        this.init(); 
    }

    public void init() {
        this.setLiftCmd(0.0);
    }

    public void update() {
        this._hatchMotor.set(this._liftCmd);
    }

    public void setLiftCmd(double liftCmd) {
        this._liftCmd = liftCmd;
    }
}