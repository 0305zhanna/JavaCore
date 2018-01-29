package codingbat.Warmup2.array123;

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
        assertEquals(true,s.array123(new int[]{1, 1, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(false,s.array123(new int[]{1, 1, 2, 4, 1}));
    }

    @Test
    public void test3() {
        assertEquals(true,s.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }
}