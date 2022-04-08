package introcontrol;

public class IntroControl {

    public static void main(String[] args) {

        int num = 10;

        System.out.println(subtractTenIfGreaterThanTen(10));
        System.out.println(subtractTenIfGreaterThanTen(15));


        printNumbers(10);

        printOddNumbers(11);

    }

    public static int subtractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
    }

    public static String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public static String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public static int calculateBonus(int sale) {
        if (sale >= 1_000_000) {
            return sale / 10;
        } else {
            return 0;
        }
    }

    public static int calculateConsumption(int prev, int next) {
        if (prev <= next) {
            return next - prev;
        } else {
            return 0;
        }
    }

    public static void printNumbers(int max) {
        int start = 0;
        while (start <= max) {
            System.out.println(start);
            start++;
        }
    }

    public static void printNumbersBetween(int min, int max) {

        for (int i = min; i <= max; i++) {
            System.out.println(i);

        }
    }

    public static void printNumbersBetweenAnyDirection(int a, int b) {
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }

    public static void printOddNumbers(int max) {
        for (int i = 0; i < max; i++) {
            if (i%2!=0) {
                System.out.println(i + "páratlan");
            }
        }
    }


}
