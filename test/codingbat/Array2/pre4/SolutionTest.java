package codingbat.Array2.pre4;

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
        int[] expected = new int[]{1,2};
        int[] actual = s.pre4(new int[]{1, 2, 4, 1});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{3, 1};
        int[] actual = s.pre4(new int[]{3, 1, 4});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{1};
        int[] actual = s.pre4(new int[]{1, 4, 4});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}