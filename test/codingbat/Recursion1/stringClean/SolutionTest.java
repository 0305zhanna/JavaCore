package codingbat.Recursion1.stringClean;

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
        assertEquals("yza", s.stringClean("yyzzza"));
    }

    @Test
    public void test2() {
        assertEquals("abcd", s.stringClean("abbbcdd"));
    }

    @Test
    public void test3() {
        assertEquals("Helo", s.stringClean("Hello"));
    }
}