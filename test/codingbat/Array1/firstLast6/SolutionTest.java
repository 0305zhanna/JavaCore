package codingbat.Array1.firstLast6;

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
        assertEquals(true,s.firstLast6(new int[]{1, 2, 6}));
    }

    @Test
    public void test2() {
        assertEquals(true,s.firstLast6(new int[]{6, 1, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals(false,s.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
}