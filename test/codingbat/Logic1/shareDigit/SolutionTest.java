package codingbat.Logic1.shareDigit;

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
        assertEquals(true, s.shareDigit(12,23));
    }

    @Test
    public void test2() {
        assertEquals(false, s.shareDigit(12,43));
    }

    @Test
    public void test3() {
        assertEquals(false, s.shareDigit(12,44));
    }
}