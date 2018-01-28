package codingbat.Recursion1.allStar;

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
        assertEquals("h*e*l*l*o", s.allStar("hello"));
    }

    @Test
    public void test2() {
        assertEquals("a*b*c", s.allStar("abc"));
    }

    @Test
    public void test3() {
        assertEquals("a*b", s.allStar("ab"));
    }
}