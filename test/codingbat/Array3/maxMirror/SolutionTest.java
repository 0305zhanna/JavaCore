package codingbat.Array3.maxMirror;

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
        assertEquals(3, s.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(3, s.maxMirror(new int[]{1, 2, 1, 4}));
    }

    @Test
    public void test3() {
        assertEquals(2, s.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }
}