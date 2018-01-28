package codingbat.Recursion1.countHi;

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
        assertEquals(1,s.countHi("xxhixx"));
    }

    @Test
    public void test2() {
        assertEquals(2,s.countHi("xhixhix"));
    }

    @Test
    public void test3() {
        assertEquals(1,s.countHi("hi"));
    }
}