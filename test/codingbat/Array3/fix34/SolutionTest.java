package codingbat.Array3.fix34;

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
        int[] expected = new int[]{1, 3, 4, 1};
        int[] actual = s.fix34(new int[]{1, 3, 1, 4});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{1, 3, 4, 1, 1, 3, 4};
        int[] actual = s.fix34(new int[]{1, 3, 1, 4, 4, 3, 1});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{3, 4, 2, 2};
        int[] actual = s.fix34(new int[]{3, 2, 2, 4});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}