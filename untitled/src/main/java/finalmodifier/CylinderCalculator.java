package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class CylinderCalculator {


    public static double calculateVolume(double r,double h){
        return r*r*PI*h;
    }

    public static double calculateSurfaceArea(double r, double h){
        return (2*(r*r*PI)+(2*r*PI*h));
    }
}
