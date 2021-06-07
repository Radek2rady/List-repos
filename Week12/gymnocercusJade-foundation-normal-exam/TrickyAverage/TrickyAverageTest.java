package gymnocercusJadeFoundationNormalExam.TrickyAverage;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrickyAverageTest {

    private Object Exception;

    @Test
    public void getTrickyAvg() {
        int[] example1 = new int[]{3, 4, 5, 6};
        assertArrayEquals(4.5, getTrickyAvg(example1));
    }

    @Test(expected = IllegalThreadStateException.class)
    public void wrongInput() {
        int[] example4 = new int[]{3, 4, "z", 6};
        assertArrayEquals(Exception, getTrickyAvg(example4));
    }
}