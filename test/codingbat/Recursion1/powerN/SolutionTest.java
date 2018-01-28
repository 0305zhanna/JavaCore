package codingbat.Recursion1.powerN;

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
        assertEquals(3, s.powerN(3,1));
    }

    @Test
    public void test2() {
        assertEquals(9, s.powerN(3,2));
    }

    @Test
    public void test3() {
        assertEquals(27, s.powerN(3,3));
    }
}