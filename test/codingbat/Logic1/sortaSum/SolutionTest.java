package codingbat.Logic1.sortaSum;

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
        assertEquals(7, s.sortaSum(3,4));
    }

    @Test
    public void test2() {
        assertEquals(20, s.sortaSum(9,4));
    }

    @Test
    public void test3() {
        assertEquals(21, s.sortaSum(10,11));
    }
}