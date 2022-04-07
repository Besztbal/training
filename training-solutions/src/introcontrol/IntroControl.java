package introcontrol;

public class IntroControl {

    public static void main(String[] args) {

        int num=10;

        System.out.println(subtractTenIfGreaterThanTen(10));
        System.out.println(subtractTenIfGreaterThanTen(15));


    }

    public static int subtractTenIfGreaterThanTen(int number){
        if (number<=10) {
            return number;
        } else {
            return number-10;
        }
    }

    public String describeNumber(int number){
        
    }
}
