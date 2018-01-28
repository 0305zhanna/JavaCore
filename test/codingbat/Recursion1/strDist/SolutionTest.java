package codingbat.Recursion1.strDist;

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
        assertEquals(9, s.strDist("catcowcat", "cat"));
    }

    @Test
    public void test2() {
        assertEquals(3, s.strDist("catcowcat", "cow"));
    }

    @Test
    public void test3() {
        assertEquals( 9, s.strDist("cccatcowcatxx", "cat"));
    }

    @Test
    public void test4() {
        assertEquals( 0, s.strDist("xyx", "z"));
    }

    @Test
    public void test5() {
        assertEquals( 0, s.strDist("x", "z"));
    }
}