package codingbat.String2.plusOut;

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
        assertEquals("++xy++", s.plusOut("12xy34", "xy"));
    }

    @Test
    public void test2() {
        assertEquals("1+++++", s.plusOut("12xy34", "1"));
    }

    @Test
    public void test3() {
        assertEquals("++xy++xy+++xy", s.plusOut("12xy34xyabcxy", "xy"));
    }
}