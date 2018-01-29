package codingbat.Warmup2.stringTimes;

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
        assertEquals("HiHi",s.stringTimes("Hi", 2));
    }

    @Test
    public void test2() {
        assertEquals("HiHiHi",s.stringTimes("Hi", 3));
    }

    @Test
    public void test3() {
        assertEquals("Hi",s.stringTimes("Hi", 1));
    }
}