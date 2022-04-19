package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Adj meg öt számot!");
        Scanner scanner = new Scanner(System.in);

        int j = 0;
        int sum=0;
        while (j<5) {
            System.out.println("Add meg a " + (j + 1) + ". számot!");
            sum += scanner.nextInt();
            j++;
        }

        System.out.println("Az összeg: " + sum);

        for (int i = 0; i < 5; i++) {
            System.out.println("Add meg a " + (i + 1) + ". számot!");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Az összeg: " + sum);
    }
}
