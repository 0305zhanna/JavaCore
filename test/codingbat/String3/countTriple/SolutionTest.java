package codingbat.String3.countTriple;

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
        assertEquals(1, s.countTriple("abcXXXabc"));
    }

    @Test
    public void test2() {
        assertEquals(3, s.countTriple("xxxabyyyycd"));
    }

    @Test
    public void test3() {
        assertEquals(0, s.countTriple("a"));
    }
}