package codingbat.AP1.sumHeights;

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
        assertEquals(6, s.sumHeights(new int[]{5, 3, 6, 7, 2}, 2,4));
    }

    @Test
    public void test2() {
        assertEquals(2, s.sumHeights(new int[]{5, 3, 6, 7, 2}, 0,1));
    }

    @Test
    public void test3() {
        assertEquals(11, s.sumHeights(new int[]{5, 3, 6, 7, 2}, 0,4));
    }
}