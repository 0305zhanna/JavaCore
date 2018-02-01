package codingbat.String2.doubleChar;

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
        assertEquals("TThhee", s.doubleChar("The"));
    }

    @Test
    public void test2() {
        assertEquals("AAAAbbbb", s.doubleChar("AAbb"));
    }

    @Test
    public void test3() {
        assertEquals("HHii--TThheerree", s.doubleChar("Hi-There"));
    }
}