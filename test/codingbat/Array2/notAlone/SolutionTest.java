package codingbat.Array2.notAlone;

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
        int[] expected = new int[]{1, 3, 3};
        int[] actual = s.notAlone(new int[]{1, 2, 3}, 2);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{1, 3, 3, 5, 5, 2};
        int[] actual = s.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{3, 4};
        int[] actual = s.notAlone(new int[]{3, 4}, 3);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}
