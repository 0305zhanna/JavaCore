package codingbat.Recursion1.triangle;

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
        assertEquals(0,s.triangle(0));
    }

    @Test
    public void test2() {
        assertEquals(1,s.triangle(1));
    }

    @Test
    public void test3() {
        assertEquals(3,s.triangle(2));
    }

    @Test
    public void test4() {
        assertEquals(10,s.triangle(4));
    }
}