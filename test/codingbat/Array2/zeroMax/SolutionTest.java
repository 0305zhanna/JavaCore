package codingbat.Array2.zeroMax;

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
        int[] expected = new int[]{5, 5, 3, 3};
        int[] actual = s.zeroMax(new int[]{0, 5, 0, 3});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{3, 4, 3, 3};
        int[] actual = s.zeroMax(new int[]{0, 4, 0, 3});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{1, 1, 0};
        int[] actual = s.zeroMax(new int[]{0, 1, 0});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test4() {
        int[] expected = new int[]{5, 1, 5};
        int[] actual = s.zeroMax(new int[]{0, 1, 5});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}