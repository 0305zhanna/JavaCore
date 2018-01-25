package codingbat.Logic1.fizzString2;

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
        assertEquals("1!",s.fizzString2(1));
        assertEquals("2!",s.fizzString2(2));
        assertEquals("Fizz!",s.fizzString2(3));
        assertEquals("FizzBuzz!",s.fizzString2(15));
    }
}