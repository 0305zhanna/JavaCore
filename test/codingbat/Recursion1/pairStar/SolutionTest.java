package codingbat.Recursion1.pairStar;

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
        assertEquals("hel*lo", s.pairStar("hello"));
    }

    @Test
    public void test2() {
        assertEquals("x*xy*y", s.pairStar("xxyy"));
    }

    @Test
    public void test3() {
        assertEquals("a*a*a*a", s.pairStar("aaaa"));
    }
}