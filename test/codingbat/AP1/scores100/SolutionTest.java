package codingbat.AP1.scores100;

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
        assertEquals(true, s.scores100(new int[]{1, 100, 100}));
    }

    @Test
    public void test2() {
        assertEquals(false, s.scores100(new int[]{1, 100, 99, 100}));
    }

    @Test
    public void test3() {
        assertEquals(true, s.scores100(new int[]{100, 1, 100, 100}));
    }
}