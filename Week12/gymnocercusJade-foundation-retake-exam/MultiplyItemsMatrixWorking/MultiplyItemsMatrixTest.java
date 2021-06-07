package retake.MultiplyItemsMatrix;

import RetakeStudy.MatrixTranspose.MatrixTranspose;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyItemsMatrixTest {

    @Test
    public void multiplyItemsMatrixNormal() {
        int[][] input = new int[][]{
                {5, 9, 3, 7},
                {3, 2, 1, 8},
                {5, 9, 3, 7},
                {3, 2, 1, 8},
        };
        int[][] expected = new int[][]{
                {5, 9, 3, 7},
                {6, 2, 2, 8},
                {5, 9, 3, 7},
                {6, 2, 2, 8},
        };
        var actual = MultiplyItemsMatrix.multiplyItemsMatrix(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void multiplyItemsMatrixNoOdd() {
        int[][] input = new int[][]{
                {4, 8, 2, 6},
                {6, 2, 2, 8},
                {4, 8, 2, 6},
                {4, 2, 2, 8},
        };
        int[][] expected = new int[][]{
                {8, 16, 4, 12},
                {6, 2, 2, 8},
                {8, 16, 4, 12},
                {4, 2, 2, 8},
        };
        var actual = MultiplyItemsMatrix.multiplyItemsMatrix(input);
        assertArrayEquals(expected, actual);
    }
}