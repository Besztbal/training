package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(100.50, false);
        System.out.println(distance.getDistanceInkm() + " " + distance.isExact());
        int integerPart=(int) distance.getDistanceInkm();
        System.out.println(integerPart);
    }
}
