package retake.MultiplyItemsMatrix;

public class MultiplyItemsMatrix {
    public static void main(String[] args) {

        int[][] example1 = new int[][]{
                {1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3},
        };
        int[][] example2 = new int[][]{
                {2, 3},
                {5, 0, 4, 0},
                {6},
                {5, 2},
        };

        System.out.println(multiplyItemsMatrix(example1));
        System.out.println(multiplyItemsMatrix(example2));

    }

    public static int[][] multiplyItemsMatrix(int[][] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (i % 2 == 0) {
                    if (input[i][j] % 2 == 0) {
                        input[i][j] = input[i][j] * 2;
                    }
                }
                if (i % 2 == 1) {
                    if (input[i][j] % 2 == 1) {
                        input[i][j] = input[i][j] * 2;
                    }
                }
            }

        }
        return input;
    }
}