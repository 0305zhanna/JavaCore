package codingbat.Array2.bigDiff;

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
        assertEquals(7, s.bigDiff(new int[]{10, 3, 5, 6}));
    }
}