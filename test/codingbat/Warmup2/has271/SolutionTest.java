package codingbat.Warmup2.has271;

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
        assertEquals(true,s.has271(new int[]{1, 2, 7, 1}));
    }

    @Test
    public void test2() {
        assertEquals(false,s.has271(new int[]{1, 2, 8, 1}));
    }

    @Test
    public void test3() {
        assertEquals(true,s.has271(new int[]{2,7,1}));
    }
}