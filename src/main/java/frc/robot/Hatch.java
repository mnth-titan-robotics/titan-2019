package frc.robot;

import edu.wpi.first.wpilibj.Victor;

public class Hatch {
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