package codingbat.Array2.tenRun;

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
        int[] expected = new int[]{2, 10, 10, 10, 20, 20};
        int[] actual = s.tenRun(new int[]{2, 10, 3, 4, 20, 5});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{10, 10, 20, 20};
        int[] actual = s.tenRun(new int[]{10, 1, 20, 2});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{10, 10, 10, 20};
        int[] actual = s.tenRun(new int[]{10, 1, 9, 20});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test4() {
        int[] expected = new int[]{0,0};
        int[] actual = s.tenRun(new int[]{0,2});
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}