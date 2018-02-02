package codingbat.Array2.has12;

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
        assertEquals(true,s.has12(new int[]{1, 3, 2}));
    }

    @Test
    public void test2() {
        assertEquals(true,s.has12(new int[]{3, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(true,s.has12(new int[]{3, 1, 4, 5, 2}));
    }
}