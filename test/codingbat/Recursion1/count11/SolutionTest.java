package codingbat.Recursion1.count11;

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
        assertEquals(2, s.count11("11abc11"));
    }

    @Test
    public void test2() {
        assertEquals(3, s.count11("abc11x11x11"));
    }

    @Test
    public void test3() {
        assertEquals(1, s.count11("111"));
    }
}