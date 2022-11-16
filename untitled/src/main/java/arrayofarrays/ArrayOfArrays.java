package arrayofarrays;

public class ArrayOfArrays {

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] testArray = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};

        arrayOfArrays.printArrayOfArrays(testArray);

        System.out.println();

        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[i].length; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public void printArrayOfArrays(int[][] a) {
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
