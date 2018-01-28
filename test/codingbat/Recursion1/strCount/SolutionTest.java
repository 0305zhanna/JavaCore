package codingbat.Recursion1.strCount;

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
        assertEquals(2, s.strCount("catcowcat", "cat"));
    }

    @Test
    public void test2() {
        assertEquals(1, s.strCount("catcowcat", "cow"));
    }

    @Test
    public void test3() {
        assertEquals( 0, s.strCount("catcowcat", "dog"));
    }
}