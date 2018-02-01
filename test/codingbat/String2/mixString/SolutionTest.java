package codingbat.String2.mixString;

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
        assertEquals("axbycz",s.mixString("abc", "xyz"));
    }

    @Test
    public void test2() {
        assertEquals("HTihere",s.mixString("Hi", "There"));
    }

    @Test
    public void test3() {
        assertEquals("xTxhxexre",s.mixString("xxxx", "There"));
    }
}