package RetakeStudy.MatrixTranspose;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTransposeTest {

    @Test
    public void matrixTransposeNormal() {
        int[][] input = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] expected = new int[][]{
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9},
        };
        var actual = MatrixTranspose.matrixTranspose(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void matrixTransposeNoSquare() {
        int[][] input = new int[][]{
                {5, 9, 3, 7},
                {3, 2, 1, 8},
        };
        int[][] expected = new int[][]{
                {5, 3},
                {9, 2},
                {3, 1},
                {7, 8},
        };
        var actual = MatrixTranspose.matrixTranspose(input);
        assertArrayEquals(expected, actual);
    }
}