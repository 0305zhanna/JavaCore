package codingbat.Recursion2.groupSum6;

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
        assertEquals(true,s.groupSum6(0,new int[]{5,6,2},8));
    }

    @Test
    public void test2() {
        assertEquals(false,s.groupSum6(0,new int[]{5,6,2},9));
    }

    @Test
    public void test3() {
        assertEquals(false,s.groupSum6(0,new int[]{5,6,2},7));
    }
}