package frc.robot;

public class Utils {
    public static double limit(double value, double min, double max) {
        if(value >= max){
            return max;
        }
        if(value <= min){
            return min;
        }

        return value;
    }
}
