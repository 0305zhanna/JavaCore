package codingbat.Warmup2.arrayCount9;

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
        assertEquals(1, s.arrayCount9(new int[]{1,2,9}));
    }

    @Test
    public void test2() {
        assertEquals(2, s.arrayCount9(new int[]{1,9,9}));
    }

    @Test
    public void test3() {
        assertEquals(3, s.arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }
}