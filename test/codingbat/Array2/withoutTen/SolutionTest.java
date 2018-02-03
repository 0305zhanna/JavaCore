package codingbat.Array2.withoutTen;

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
        int[] expected = new int[]{1, 2, 0, 0};
        int[] actual = s.withoutTen(new int[]{1, 10, 10, 2});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{2, 0, 0};
        int[] actual = s.withoutTen(new int[]{10, 2, 10});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{1, 99, 0};
        int[] actual = s.withoutTen(new int[]{1, 99, 10});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}