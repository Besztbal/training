package mathproblems;

public class Division {


    public void getRightNumbers(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % i == 0){
                System.out.println(numbers[i]);
            }
        }
    }

    public void getDivisors(int number) {
        int divisor = 1;

        while (divisor <= number) {

            if (number % divisor == 0) {
                System.out.println(number + " osztója: " + divisor);
            }

            divisor++;
        }


    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(12);

        int[] array={2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        division.getRightNumbers(array);
    }
}
