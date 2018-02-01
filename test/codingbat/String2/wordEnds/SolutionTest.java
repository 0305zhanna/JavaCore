package codingbat.String2.wordEnds;

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
        assertEquals("c13i", s.wordEnds("abcXY123XYijk", "XY"));
    }

    @Test
    public void test2() {
        assertEquals("13", s.wordEnds("XY123XY", "XY"));
    }

    @Test
    public void test3() {
        assertEquals("11", s.wordEnds("XY1XY", "XY"));
    }
}