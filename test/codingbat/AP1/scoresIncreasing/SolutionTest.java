package codingbat.AP1.scoresIncreasing;

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
        assertEquals(true, s.scoresIncreasing(new int[]{1,3,4}));
    }

    @Test
    public void test2() {
        assertEquals(false, s.scoresIncreasing(new int[]{1,3,2}));
    }

    @Test
    public void test3() {
        assertEquals(true, s.scoresIncreasing(new int[]{1,1,4}));
    }
}