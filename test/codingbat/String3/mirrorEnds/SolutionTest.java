package codingbat.String3.mirrorEnds;

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
        assertEquals("ab", s.mirrorEnds("abXYZba"));
    }

    @Test
    public void test2() {
        assertEquals("a", s.mirrorEnds("abca"));
    }

    @Test
    public void test3() {
        assertEquals("aba", s.mirrorEnds("aba"));
    }
}