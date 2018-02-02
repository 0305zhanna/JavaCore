package codingbat.Array2.twoTwo;

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
        assertEquals(true,s.twoTwo(new int[]{4, 2, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(true,s.twoTwo(new int[]{2, 2, 4}));
    }

    @Test
    public void test3() {
        assertEquals(false,s.twoTwo(new int[]{2, 2, 4, 2}));
    }
}