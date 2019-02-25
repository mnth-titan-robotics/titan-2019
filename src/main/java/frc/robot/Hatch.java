package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Hatch {
    private DoubleSolenoid.Value _hatchControlCmd;

    private DoubleSolenoid _hatchControl;

    public Hatch() {
        this._hatchControl= new DoubleSolenoid(SheetOfKnowledge.SOLENOID_EXTEND_A, SheetOfKnowledge.SOLENOID_RETRACT_B);
    
        this.init(); 
    }

    public void init() {
        this._hatchControlCmd = DoubleSolenoid.Value.kReverse;
    }

    public void update() {
        this._hatchControl.set(this._hatchControlCmd);
    }

    public void setHatchCmd(boolean _extendCmd) {
        if(_extendCmd){
            this._hatchControlCmd = DoubleSolenoid.Value.kForward;
        }else{
            this._hatchControlCmd = DoubleSolenoid.Value.kReverse;
        }
    }
}