package arrayofarrays;

public class Rectangle {

    public void  rectangularMatrix(int sizeA, int sizeB) {
        int[][] rectangularMatrix = new int[sizeA][sizeB];
        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                rectangularMatrix[i][j] = i;
                System.out.print(rectangularMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.rectangularMatrix(2,5);
    }
}
