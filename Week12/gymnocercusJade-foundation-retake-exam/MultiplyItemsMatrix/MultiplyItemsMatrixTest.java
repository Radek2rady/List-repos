package retake.MultiplyItemsMatrix;

import RetakeStudy.MatrixTranspose.MatrixTranspose;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyItemsMatrixTest {

    @Test
    public void multiplyItemsMatrix() {
        int[][] input = new int[][]{
                {5, 9, 3, 7},
                {3, 2, 1, 8},
                {5, 9, 3, 7},
                {3, 2, 1, 8},
        };
        int[][] expected = new int[][]{
                {5, 3},
                {9, 2},
                {3, 1},
                {7, 8},
        };
        var actual = MultiplyItemsMatrix.multiplyItemsMatrix(input);
        assertArrayEquals(expected, actual);
    }
}