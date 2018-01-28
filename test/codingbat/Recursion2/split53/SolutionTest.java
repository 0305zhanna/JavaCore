package codingbat.Recursion2.split53;

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
        assertEquals(true, s.split53(new int[]{1,1}));
    }

    @Test
    public void test2() {
        assertEquals(false, s.split53(new int[]{1,1,1}));
    }

    @Test
    public void test3() {
        assertEquals(true, s.split53(new int[]{2,4,2}));
    }
}