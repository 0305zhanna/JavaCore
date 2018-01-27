package codingbat.Recursion2.groupSum5;

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
        assertEquals(true,s.groupSum5(0,new int[]{2,5,10,4},19));
    }

    @Test
    public void test2() {
        assertEquals(true,s.groupSum5(0,new int[]{2,5,10,4},17));
    }

    @Test
    public void test3() {
        assertEquals(false,s.groupSum5(0,new int[]{2,5,10,4},12));
    }

    @Test
    public void test4() {
        assertEquals(false,s.groupSum5(0,new int[]{2,5,4,10},12));
    }

    @Test
    public void test5() {
        assertEquals(false,s.groupSum5(0,new int[]{2,4,5,1},6));
    }
}