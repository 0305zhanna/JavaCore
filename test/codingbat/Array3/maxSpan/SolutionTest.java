package codingbat.Array3.maxSpan;

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
        assertEquals(4, s.maxSpan(new int[]{1, 2, 1, 1, 3}));
    }

    @Test
    public void test2() {
        assertEquals(6, s.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
    }

    @Test
    public void test3() {
        assertEquals(6, s.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }
}