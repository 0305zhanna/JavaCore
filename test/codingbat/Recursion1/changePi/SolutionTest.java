package codingbat.Recursion1.changePi;

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
        assertEquals("x3.14x",s.changePi("xpix"));
    }

    @Test
    public void test2() {
        assertEquals( "3.143.14",s.changePi("pipi"));
    }

    @Test
    public void test3() {
        assertEquals("3.14p",s.changePi("pip"));
    }
}