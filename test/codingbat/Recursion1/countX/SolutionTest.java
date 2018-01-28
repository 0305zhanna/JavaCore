package codingbat.Recursion1.countX;

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
        assertEquals(4,s.countX("xxhixx"));
    }

    @Test
    public void test2() {
        assertEquals(3,s.countX("xhixhix"));
    }

    @Test
    public void test3() {
        assertEquals(0,s.countX("hi"));
    }
}