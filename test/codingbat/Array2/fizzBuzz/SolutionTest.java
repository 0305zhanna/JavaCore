package codingbat.Array2.fizzBuzz;

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
        String[] expected = new String[]{"1", "2", "Fizz", "4", "Buzz"};
        String[] actual = s.fizzBuzz(1,6);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test2() {
        String[] expected = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"};
        String[] actual = s.fizzBuzz(1,8);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void test3() {
        String[] expected = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};
        String[] actual = s.fizzBuzz(1,11);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}