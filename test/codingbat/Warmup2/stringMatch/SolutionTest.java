package codingbat.Warmup2.stringMatch;

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
        assertEquals(3,s.stringMatch("xxcaazz", "xxbaaz"));
    }

    @Test
    public void test2() {
        assertEquals(2,s.stringMatch("abc", "abc"));
    }

    @Test
    public void test3() {
        assertEquals(0,s.stringMatch("abc", "axc"));
    }
}