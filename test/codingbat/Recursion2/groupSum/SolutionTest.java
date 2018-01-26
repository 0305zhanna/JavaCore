package codingbat.Recursion2.groupSum;

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
        assertEquals(true, s.groupSum(0, new int[]{2, 4, 8}, 10));
    }

    @Test
    public void test2() {
        assertEquals(true, s.groupSum(0, new int[]{2, 4, 8}, 14));
    }

    @Test
    public void test3() {
        assertEquals(false, s.groupSum(0, new int[]{2, 4, 8}, 9));
    }
}