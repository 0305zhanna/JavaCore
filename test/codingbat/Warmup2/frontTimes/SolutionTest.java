package codingbat.Warmup2.frontTimes;

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
        assertEquals("ChoCho",s.frontTimes("Chocolate", 2));
    }

    @Test
    public void test2() {
        assertEquals("ChoChoCho",s.frontTimes("Chocolate", 3));
    }

    @Test
    public void test3() {
        assertEquals("AbcAbcAbc",s.frontTimes("Abc", 3));
    }
}