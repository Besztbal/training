package conversions;

public class TooBigNumber {

    public long getRightResult(int number){
        long bigNumber=2_147_483_647;
        bigNumber+=number;
        return bigNumber;
    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber=new TooBigNumber();

        System.out.println(tooBigNumber.getRightResult(32));
    }
}
