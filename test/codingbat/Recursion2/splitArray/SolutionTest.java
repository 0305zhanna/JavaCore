package codingbat.Recursion2.splitArray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }
//
//    @Test
//    public void test1() {
//        assertEquals(5,s.sum(0,5,new int[]{1,1,1,1,1}));
//    }

    @Test
    public void test2() {
        assertEquals(true,s.splitArray(new int[]{2,2}));
    }

    @Test
    public void test3() {
        assertEquals(true,s.splitArray(new int[]{2,2,2,2}));
    }

    @Test
    public void test4() {
        assertEquals(false,s.splitArray(new int[]{2,1,2,2}));
    }

    @Test
    public void test5() {
        assertEquals(false,s.splitArray(new int[]{2}));
    }

    @Test
    public void test7() {
        assertEquals(false,s.splitArray(new int[]{2,3}));
    }

    @Test
    public void test8() {
        assertEquals(true,s.splitArray(new int[]{5,2,3}));
    }
}