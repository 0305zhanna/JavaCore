package codingbat.Array2.evenOdd;

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
        int[] expected = new int[]{0, 0, 0, 1, 1, 1, 1};
        int[] actual = s.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{2, 3, 3};
        int[] actual = s.evenOdd(new int[]{3, 3, 2});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{2, 2, 2};
        int[] actual = s.evenOdd(new int[]{2, 2, 2});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}