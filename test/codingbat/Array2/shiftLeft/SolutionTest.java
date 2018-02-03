package codingbat.Array2.shiftLeft;

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
        int[] expected = new int[]{2, 5, 3, 6};
        int[] actual = s.shiftLeft(new int[]{6, 2, 5, 3});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{2,1};
        int[] actual = s.shiftLeft(new int[]{1,2});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{1};
        int[] actual = s.shiftLeft(new int[]{1});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}