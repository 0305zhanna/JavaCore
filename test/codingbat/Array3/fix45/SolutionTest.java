package codingbat.Array3.fix45;

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
        int[] expected = new int[]{9, 4, 5, 4, 5, 9};
        int[] actual = s.fix45(new int[]{5, 4, 9, 4, 9, 5});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{1, 4, 5, 1};
        int[] actual = s.fix45(new int[]{1, 4, 1, 5});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{1, 4, 5, 1, 1, 4, 5};
        int[] actual = s.fix45(new int[]{1, 4, 1, 5, 5, 4, 1});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}