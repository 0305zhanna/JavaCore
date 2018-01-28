package codingbat.Recursion1.factorial;

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
        assertEquals(1, s.factorial(1));
    }

    @Test
    public void test2() {
        assertEquals(2, s.factorial(2));
    }

    @Test
    public void test3() {
        assertEquals(6, s.factorial(3));
    }
}