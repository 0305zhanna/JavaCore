package codingbat.string1.withoutX2;

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
        assertEquals("Hi", s.withoutX2("xHi"));
    }

    @Test
    public void test2() {
        assertEquals("", s.withoutX2("x"));
    }

    @Test
    public void test3() {
        assertEquals("", s.withoutX2("xx"));
    }

    @Test
    public void test4() {
        assertEquals("v", s.withoutX2("vx"));
    }

    @Test
    public void test5() {
        assertEquals("v", s.withoutX2("v"));
    }

    @Test
    public void test6() {
        assertEquals("Hi", s.withoutX2("Hi"));
    }
}