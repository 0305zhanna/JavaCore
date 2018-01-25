package codingbat.string1.without2;

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
        assertEquals("lloHe", s.without2("HelloHe"));
    }

    @Test
    public void test2() {
        assertEquals("HelloHi", s.without2("HelloHi"));
    }

    @Test
    public void test3() {
        assertEquals("", s.without2("Hi"));
    }

    @Test
    public void test4() {
        assertEquals("x", s.without2("x"));
    }
}