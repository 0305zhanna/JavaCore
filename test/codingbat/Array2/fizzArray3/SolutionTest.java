package codingbat.Array2.fizzArray3;

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
        int[] expected = new int[]{5, 6, 7, 8, 9};
        int[] actual = s.fizzArray3(5,10);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}