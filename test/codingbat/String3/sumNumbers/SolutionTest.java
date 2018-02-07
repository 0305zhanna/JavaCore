package codingbat.String3.sumNumbers;

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
        assertEquals(123, s.sumNumbers("abc123xyz"));
    }

    @Test
    public void test2() {
        assertEquals(44, s.sumNumbers("aa11b33"));
    }

    @Test
    public void test3() {
        assertEquals(18, s.sumNumbers("7 11"));
    }
}