package codingbat.Array2.haveThree;

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
        assertEquals(true, s.haveThree(new int[]{3, 1, 3, 1, 3}));
    }

    @Test
    public void test2() {
        assertEquals(false, s.haveThree(new int[]{3, 1, 3, 3}));
    }

    @Test
    public void test3() {
        assertEquals(false, s.haveThree(new int[]{3, 4, 3, 3, 4}));
    }
}