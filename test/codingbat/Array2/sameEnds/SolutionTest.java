package codingbat.Array2.sameEnds;

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
        assertEquals(false,s.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},1));
    }

    @Test
    public void test2() {
        assertEquals(true,s.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},2));
    }

    @Test
    public void test3() {
        assertEquals(false,s.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},3));
    }
}