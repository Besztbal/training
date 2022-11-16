package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] week = {"Hétfő", "kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap" };

        System.out.println(week[1]);


        int[] powersOfTwo = new int[5];
        powersOfTwo[0] = 1;
        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i-1] * 2;
        }

        for (int n:powersOfTwo) {
            System.out.println(n);
        }

        boolean[] trueFalse=new boolean[6];

        for (int i = 0; i < trueFalse.length; i++) {
            trueFalse[i]= i % 2 != 0;
        }

        for (boolean b:trueFalse) {
            System.out.print(b+" ");
        }
        System.out.println();

        boolean[] bools = new boolean[6];

        for (int i = 1; i < bools.length; i++) {
            bools[i] = !bools[i - 1];
        }

        for (int i = 0; i < bools.length; i++) {
            System.out.print(bools[i] + " ");
        }


    }
}
