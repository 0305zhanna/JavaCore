package codingbat.Recursion2.groupNoAdj;

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
        assertEquals(true,s.groupNoAdj(0,new int[]{2,5,10,4},12));
    }

    @Test
    public void test2() {
        assertEquals(false,s.groupNoAdj(0,new int[]{2,5,10,4},14));
    }

    @Test
    public void test3() {
        assertEquals(false,s.groupNoAdj(0,new int[]{2,5,10,4},7));
    }

    @Test
    public void test4() {
        assertEquals(true,s.groupNoAdj(0,new int[]{2,5,10,4},9));
    }
}