package codingbat.String3.notReplace;

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
        assertEquals("is not test", s.notReplace("is test"));
    }

    @Test
    public void test2() {
        assertEquals("is not-is not", s.notReplace("is-is"));
    }

    @Test
    public void test3() {
        assertEquals("This is not right", s.notReplace("This is right"));
    }
}