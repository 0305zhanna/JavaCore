package codingbat.Array1.reverse3;

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
        int[] exp = new int[]{3, 2, 1};
        int[] act = s.reverse3(new int[]{1, 2, 3});
        for (int i = 0; i < act.length; i++) {
            assertEquals(exp[i],act[i]);
        }
    }
}