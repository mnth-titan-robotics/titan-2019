package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;

public class Hatch {
    private Solenoid _hatchExtend;
    private Solenoid _hatchRetract;

    private boolean _extendCmd;
    private boolean _retractCmd;

    public Hatch() {
        this._hatchExtend = new Solenoid(SheetOfKnowledge.SOLENOID_EXTEND_A);
        this._hatchRetract = new Solenoid(SheetOfKnowledge.SOLENOID_RETRACT_B);

        this.init(); 
    }

    public void init() {
        this._extendCmd = false;
        this._retractCmd = false;
    }

    public void update() {

    }

    public void setExtendCmd(boolean extendCmd) {

    }

    public void setRetractCmd(boolean retractCmd) {

    }
}