package codingbat.Recursion1.count7;

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
        assertEquals(2, s.count7(717));
    }

    @Test
    public void test2() {
        assertEquals(1, s.count7(7));
    }

    @Test
    public void test3() {
        assertEquals(0, s.count7(123));
    }
}