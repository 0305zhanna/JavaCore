package codingbat.Warmup2.stringX;

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
        assertEquals("xHix",s.stringX("xxHxix"));
    }

    @Test
    public void test2() {
        assertEquals("abcd",s.stringX("abxxxcd"));
    }

    @Test
    public void test3() {
        assertEquals("xabcdx",s.stringX("xabxxxcdx"));
    }

    @Test
    public void test4() {
        assertEquals("xx",s.stringX("xx"));
    }

    @Test
    public void test5() {
        assertEquals("xx",s.stringX("xxxxxxxxxxxxxxxxxxxxxx"));
    }
}