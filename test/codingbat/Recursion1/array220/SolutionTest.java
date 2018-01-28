package codingbat.Recursion1.array220;

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
        assertEquals(true,s.array220(new int[]{1,2,20},0));
    }

    @Test
    public void test2() {
        assertEquals(true,s.array220(new int[]{3,30},0));
    }

    @Test
    public void test3() {
        assertEquals(false,s.array220(new int[]{3},0));
    }
}