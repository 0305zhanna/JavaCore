package codingbat.Array2.sum67;

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
        assertEquals(5, s.sum67(new int[]{1, 2, 2}));
    }

    @Test
    public void test2() {
        assertEquals(5, s.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
    }

    @Test
    public void test3() {
        assertEquals(4, s.sum67(new int[]{1, 1, 6, 7, 2}));
    }

    @Test
    public void test4() {
        assertEquals(18, s.sum67(new int[]{2, 7, 6, 2, 6, 7, 2, 7}));
    }
}