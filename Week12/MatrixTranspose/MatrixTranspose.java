package RetakeStudy.MatrixTranspose;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] example1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] example2 = new int[][]{
                {5, 9, 3, 7},
                {3, 2, 1, 8},
        };


        System.out.println(matrixTranspose(example1));
        System.out.println(matrixTranspose(example2));

    }

    public static int[][] matrixTranspose(int[][] input) {
        int transpose[][] = new int[input[0].length][input.length];
        for (int i = 0; i < input[0].length; i++) {
            for (int j = 0; j < input.length; j++) {
                transpose[i][j] = input[j][i];
            }
        }
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        return transpose;
    }


}
