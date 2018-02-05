package codingbat.AP1.scoresClump;

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
        assertEquals(true, s.scoresClump(new int[]{3, 4, 5}));
    }

    @Test
    public void test2() {
        assertEquals(false, s.scoresClump(new int[]{3, 4, 6}));
    }

    @Test
    public void test3() {
        assertEquals(true, s.scoresClump(new int[]{1, 3, 5, 5}));
    }
}