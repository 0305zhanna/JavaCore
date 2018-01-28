package codingbat.Recursion1.countHi2;

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
        assertEquals(1, s.countHi2("ahixhi"));
    }

    @Test
    public void test2() {
        assertEquals(2, s.countHi2("ahibhi"));
    }

    @Test
    public void test3() {
        assertEquals(0, s.countHi2("xhixhi"));
    }
}