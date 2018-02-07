package codingbat.AP1.userCompare;

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
        assertEquals(-1,s.userCompare("bb", 1, "zz", 2));
    }

    @Test
    public void test2() {
        assertEquals(1,s.userCompare("bb", 1, "aa", 2));
    }

    @Test
    public void test3() {
        assertEquals(0,s.userCompare("bb", 1, "bb", 1));
    }
}