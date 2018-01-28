package codingbat.Recursion1.fibonacci;

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
        assertEquals(0, s.fibonacci(0));
    }

    @Test
    public void test2() {
        assertEquals(1, s.fibonacci(1));
    }

    @Test
    public void test3() {
        assertEquals(1, s.fibonacci(2));
    }
}