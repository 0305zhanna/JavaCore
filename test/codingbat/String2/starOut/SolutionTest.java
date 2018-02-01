package codingbat.String2.starOut;

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
        assertEquals("ad", s.starOut("ab*cd"));
    }

    @Test
    public void test2() {
        assertEquals("ad", s.starOut("ab**cd"));
    }

    @Test
    public void test3() {
        assertEquals("silly", s.starOut("sm*eilly"));
    }
}