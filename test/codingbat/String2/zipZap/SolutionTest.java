package codingbat.String2.zipZap;

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
        assertEquals("zpXzp", s.zipZap("zipXzap"));
    }

    @Test
    public void test2() {
        assertEquals("zpzp", s.zipZap("zopzop"));
    }

    @Test
    public void test3() {
        assertEquals("zzzpzp", s.zipZap("zzzopzop"));
    }
}