package codingbat.AP1.scoresAverage;

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
        assertEquals(4, s.scoresAverage(new int[]{2, 2, 4, 4}));
    }

    @Test
    public void test2() {
        assertEquals(4, s.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
    }

    @Test
    public void test3() {
        assertEquals(4, s.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
    }
}