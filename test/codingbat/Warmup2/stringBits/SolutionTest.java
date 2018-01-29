package codingbat.Warmup2.stringBits;

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
        assertEquals("Hlo", s.stringBits("Hello"));
    }

    @Test
    public void test2() {
        assertEquals("H", s.stringBits("Hi"));
    }

    @Test
    public void test3() {
        assertEquals("Hello", s.stringBits("Heeololeo"));
    }
}