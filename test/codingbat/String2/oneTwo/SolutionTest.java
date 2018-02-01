package codingbat.String2.oneTwo;

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
        assertEquals("bca",s.oneTwo("abc"));
    }

    @Test
    public void test2() {
        assertEquals("cat",s.oneTwo("tca"));
    }

    @Test
    public void test3() {
        assertEquals("catdog",s.oneTwo("tcagdo"));
    }
}