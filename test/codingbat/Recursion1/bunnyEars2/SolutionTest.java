package codingbat.Recursion1.bunnyEars2;

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
        assertEquals(0, s.bunnyEars2(0));
    }

    @Test
    public void test2() {
        assertEquals(2, s.bunnyEars2(1));
    }

    @Test
    public void test3() {
        assertEquals(5, s.bunnyEars2(2));
    }
}