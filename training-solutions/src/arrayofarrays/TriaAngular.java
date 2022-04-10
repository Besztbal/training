package arrayofarrays;

public class TriaAngular {

    public static void main(String[] args) {

        TriaAngular triaAngular=new TriaAngular();

        triaAngular.triangularMatrix(4);
    }


    public void triangularMatrix(int size) {
        int[][] triangularMatrix = new int[size][];
        for (int i = 0; i < triangularMatrix.length; i++) {
            triangularMatrix[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangularMatrix[i][j] = i;
                System.out.print(triangularMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
