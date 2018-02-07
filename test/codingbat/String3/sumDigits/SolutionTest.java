package codingbat.String3.sumDigits;

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
        assertEquals(6, s.sumDigits("aa1bc2d3"));
    }

    @Test
    public void test2() {
        assertEquals(8, s.sumDigits("aa11b33"));
    }

    @Test
    public void test3() {
        assertEquals(0, s.sumDigits("Chocolate"));
    }
}