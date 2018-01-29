package codingbat.Warmup2.doubleX;

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
        assertEquals(true, s.doubleX("axxbb"));
    }

    @Test
    public void test2() {
        assertEquals(false, s.doubleX("axaxax"));
    }

    @Test
    public void test3() {
        assertEquals(true, s.doubleX("xxxxx"));
    }
}