package codingbat.Recursion1.strCopies;

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
        assertEquals(true, s.strCopies("catcowcat", "cat", 2));
    }

    @Test
    public void test2() {
        assertEquals(false, s.strCopies("catcowcat", "cow", 2));
    }

    @Test
    public void test3() {
        assertEquals( true, s.strCopies("catcowcat", "cow", 1));
    }
}