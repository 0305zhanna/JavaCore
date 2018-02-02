package codingbat.Array2.either24;

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
        assertEquals(true,s.either24(new int[]{1, 2, 2}));
    }

    @Test
    public void test2() {
        assertEquals(false,s.either24(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test3() {
        assertEquals(true,s.either24(new int[]{1, 2, 2}));
    }
}