package codingbat.Array3.linearIn;

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
        assertEquals(true, s.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
    }

    @Test
    public void test2() {
        assertEquals(false, s.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
    }

    @Test
    public void test3() {
        assertEquals(true, s.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }
}