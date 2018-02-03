package codingbat.Array2.zeroFront;

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
        int[] expected = new int[]{0, 0, 1, 1};
        int[] actual = s.zeroFront(new int[]{1, 0, 0, 1});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }

    }

    @Test
    public void test2() {
        int[] expected = new int[]{0, 0, 1, 1, 1};
        int[] actual = s.zeroFront(new int[]{0, 1, 1, 0, 1});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }

    }

    @Test
    public void test3() {
        int[] expected = new int[]{0, 1};
        int[] actual = s.zeroFront(new int[]{1, 0});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }

    }
}