package codingbat.Warmup2.noTriples;

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
        assertEquals(true,s.noTriples(new int[]{1, 1, 2, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(false,s.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(false,s.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }
}