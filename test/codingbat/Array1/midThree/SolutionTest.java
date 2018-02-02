package codingbat.Array1.midThree;

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
        int[] excepted = new int[]{2,3,4};
        int[] actual = s.midThree(new int[]{1, 2, 3, 4, 5});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(excepted[i],actual[i]);
        }
    }
}