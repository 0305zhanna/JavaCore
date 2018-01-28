package codingbat.Recursion1.bunnyEars;

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
        assertEquals(0,s.bunnyEars(0));
    }

    @Test
    public void test2() {
        assertEquals(2,s.bunnyEars(1));
    }

    @Test
    public void test3() {
        assertEquals(4,s.bunnyEars(2));
    }
}