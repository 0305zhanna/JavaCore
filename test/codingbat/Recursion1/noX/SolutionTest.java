package codingbat.Recursion1.noX;

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
        assertEquals("ab",s.noX("xaxb"));
    }

    @Test
    public void test2() {
        assertEquals("abc",s.noX("abc"));
    }

    @Test
    public void test3() {
        assertEquals("",s.noX("xx"));
    }
}