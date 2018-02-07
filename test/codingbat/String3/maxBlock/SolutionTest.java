package codingbat.String3.maxBlock;

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
        assertEquals(2, s.maxBlock("hoopla"));
    }

    @Test
    public void test2() {
        assertEquals(3, s.maxBlock("abbCCCddBBBxx"));
    }

    @Test
    public void test3() {
        assertEquals(0, s.maxBlock(""));
    }

    @Test
    public void test4() {
        assertEquals(1, s.maxBlock("s"));
    }

    @Test
    public void test5() {
        assertEquals(2, s.maxBlock("xyzz"));
    }

    @Test
    public void test6() {
        assertEquals(4, s.maxBlock("XXBBBbbxxXXXX"));
    }
}