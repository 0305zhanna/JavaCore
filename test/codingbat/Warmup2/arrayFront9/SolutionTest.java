package codingbat.Warmup2.arrayFront9;

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
        assertEquals(true,s.arrayFront9(new int[]{1, 2, 9, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(false,s.arrayFront9(new int[]{1, 2, 3, 4, 9}));
    }

    @Test
    public void test3() {
        assertEquals(false,s.arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test4() {
        assertEquals(true,s.arrayFront9(new int[]{1, 9, 9, 4}));
    }
}