package codingbat.Recursion2.splitOdd10;

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
    public void tets1() {
        assertEquals(true, s.splitOdd10(new int[]{5,5,5}));
    }

    @Test
    public void tets2() {
        assertEquals(false, s.splitOdd10(new int[]{5,5,6}));
    }

    @Test
    public void tets3() {
        assertEquals(true, s.splitOdd10(new int[]{5,5,6,1}));
    }
}