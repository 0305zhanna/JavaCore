package codingbat.Logic1.fizzString;

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
        assertEquals("Fizz", s.fizzString("fig"));
    }

    @Test
    public void test2() {
        assertEquals("Buzz", s.fizzString("dib"));
    }

    @Test
    public void test3() {
        assertEquals("FizzBuzz", s.fizzString("fib"));
    }
}