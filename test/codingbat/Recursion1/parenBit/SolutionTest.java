package codingbat.Recursion1.parenBit;

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
        assertEquals("(abc)", s.parenBit("xyz(abc)123"));
    }

    @Test
    public void test2() {
        assertEquals("(hello)", s.parenBit("x(hello)"));
    }

    @Test
    public void test3() {
        assertEquals( "(xy)", s.parenBit("(xy)1"));
    }
}