package codingbat.Warmup2.array667;

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
        assertEquals(1,s.array667(new int[]{6,6,2}));
    }

    @Test
    public void test2() {
        assertEquals(1,s.array667(new int[]{6,6,2,6}));
    }

    @Test
    public void test3() {
        assertEquals(1,s.array667(new int[]{6,7,2,6}));
    }
}