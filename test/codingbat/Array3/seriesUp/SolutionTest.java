package codingbat.Array3.seriesUp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void test1() {
        int[] expected = new int[]{1, 1, 2, 1, 2, 3};
        int[] actual = s.seriesUp(3);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        int[] actual = s.seriesUp(4);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{1, 1, 2};
        int[] actual = s.seriesUp(2);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}