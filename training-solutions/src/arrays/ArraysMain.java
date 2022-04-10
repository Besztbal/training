package arrays;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {

        int[] a1 = {3,2,1};
        int[] a2 = {3,2,1};

        int[][] b1 = {{1},{1,2},{1,2,3}};
        int[][] b2 = {{1},{1,2},{1,2,3}};

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.deepToString(b1));

        System.out.println(Arrays.equals(a1,a2));
        System.out.println(Arrays.deepEquals(b1,b2));


        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        System.out.println(Arrays.toString(Arrays.copyOfRange(a1,1,3)));

        ArraysMain arraysMain = new ArraysMain();

        System.out.println("numberOfDaysAsString");
        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println("multiplicationTableAsString");
        System.out.println(arraysMain.multiplicationTableAsString(10));




    }

    public String numberOfDaysAsString(){
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);

    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int min = min(day.length, anotherDay.length);
        double[] rangeOfDay = Arrays.copyOfRange(day, 0, min);
        double[] rangeOfAnotherDay = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(rangeOfDay, rangeOfAnotherDay);
    }

    private int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public boolean wonLottery(int[] winner, int[] stake) {

//        Arrays.sort(winner);
//        Arrays.sort(stake);
//        return Arrays.equals(winner, stake);

        int[] copyOfWinner = Arrays.copyOf(winner, winner.length);
        int[] copyOfStake = Arrays.copyOf(stake, stake.length);
        Arrays.sort(copyOfWinner);
        Arrays.sort(copyOfStake);
        return Arrays.equals(copyOfWinner, copyOfStake);
    }


}
