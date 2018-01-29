package codingbat.Warmup2.stringSplosion;

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
        assertEquals("CCoCodCode",s.stringSplosion("Code"));
    }

    @Test
    public void test2() {
        assertEquals("aababc",s.stringSplosion("abc"));
    }

    @Test
    public void test3() {
        assertEquals("aab",s.stringSplosion("ab"));
    }
}