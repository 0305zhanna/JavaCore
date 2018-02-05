package codingbat.Array3.countClumps;

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
        assertEquals(2, s.countClumps(new int[]{1, 2, 2, 3, 4, 4}));
    }

    @Test
    public void test2() {
        assertEquals(2, s.countClumps(new int[]{1, 1, 2, 1, 1}));
    }

    @Test
    public void test3() {
        assertEquals(1, s.countClumps(new int[]{1, 1, 1, 1, 1}));
    }
}