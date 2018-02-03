package codingbat.Array2.tripleUp;

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
        assertEquals(true,s.tripleUp(new int[]{1, 4, 5, 6, 2}));
    }

    @Test
    public void test2() {
        assertEquals(true,s.tripleUp(new int[]{1, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals(false,s.tripleUp(new int[]{1, 2, 4}));
    }
}