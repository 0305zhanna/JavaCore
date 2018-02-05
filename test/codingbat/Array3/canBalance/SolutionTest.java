package codingbat.Array3.canBalance;

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
        assertEquals(true, s.canBalance(new int[]{1, 1, 1, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(false, s.canBalance(new int[]{2, 1, 1, 2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(true, s.canBalance(new int[]{10, 10}));
    }

    @Test
    public void test4() {
        assertEquals(true, s.canBalance(new int[]{10, 0, 1, -1, 10}));
    }
}