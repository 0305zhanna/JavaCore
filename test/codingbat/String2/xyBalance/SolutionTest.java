package codingbat.String2.xyBalance;

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
        assertEquals(true,s.xyBalance("aaxbby"));
    }

    @Test
    public void test2() {
        assertEquals(false,s.xyBalance("aaxbb"));
    }

    @Test
    public void test3() {
        assertEquals(false,s.xyBalance("yaaxbb"));
    }
}