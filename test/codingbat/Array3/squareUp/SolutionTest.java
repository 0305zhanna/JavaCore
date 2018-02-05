package codingbat.Array3.squareUp;

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
        int[] expected = new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1};
        int[] actual = s.squareUp(3);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] expected = new int[]{0, 1, 2, 1};
        int[] actual = s.squareUp(2);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] expected = new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1};
        int[] actual = s.squareUp(4);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test4() {
        int[] expected = new int[]{1};
        int[] actual = s.squareUp(1);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test5() {
        int[] expected = new int[0];
        int[] actual = s.squareUp(0);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}