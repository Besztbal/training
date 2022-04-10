package finalmodifier;


public class CylinderCalculatorBasedOnCircle {

    public double calculateVolume(double r,double h){
        return CylinderCalculator.calculateVolume(r,h);
    }

    public double calculateSurfaceArea(double r, double h) {
        return 2 * new CircleCalculator().calculateArea(r) + new CircleCalculator().calculatePerimeter(r) * h;
    }
}
