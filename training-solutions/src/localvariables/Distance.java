package localvariables;

public class Distance {


    private double distanceInkm;
    private boolean exact;

    public Distance(double distanceInkm, boolean exact) {
        this.distanceInkm = distanceInkm;
        this.exact = exact;
    }

    public double getDistanceInkm() {
        return distanceInkm;
    }

    public boolean isExact() {
        return exact;
    }
}
