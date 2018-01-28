package codingbat.Recursion1.endX;

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
        assertEquals("rexx", s.endX("xxre"));
    }

    @Test
    public void test2() {
        assertEquals("hixxxx", s.endX("xxhixx"));
    }

    @Test
    public void test3() {
        assertEquals("hihixxx", s.endX("xhixhix"));
    }
}