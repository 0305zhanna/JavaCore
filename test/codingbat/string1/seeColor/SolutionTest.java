package codingbat.string1.seeColor;

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
        assertEquals("red", s.seeColor("red"));
    }

    @Test
    public void test2() {
        assertEquals("red", s.seeColor("redxx"));
    }

    @Test
    public void test3() {
        assertEquals("blue", s.seeColor("blueTimes"));
    }

    @Test
    public void test4() {
        assertEquals("", s.seeColor("blu"));
    }

}