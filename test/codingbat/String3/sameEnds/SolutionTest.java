package codingbat.String3.sameEnds;

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
        assertEquals("ab", s.sameEnds("abXYab"));
    }

    @Test
    public void test2() {
        assertEquals("x", s.sameEnds("xx"));
    }

    @Test
    public void test3() {
        assertEquals("x", s.sameEnds("xxx"));
    }

    @Test
    public void test4() {
        assertEquals("", s.sameEnds("xavaXYZjava"));
    }
}