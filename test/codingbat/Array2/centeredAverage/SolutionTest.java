package codingbat.Array2.centeredAverage;

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
        assertEquals(3, s.centeredAverage(new int[]{1, 2, 3, 4, 100}));
    }

    @Test
    public void test2() {
        assertEquals(5, s.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
    }

    @Test
    public void test3() {
        assertEquals(-3, s.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}