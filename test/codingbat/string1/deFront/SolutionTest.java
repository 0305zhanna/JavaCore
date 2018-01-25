package codingbat.string1.deFront;

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
        assertEquals("aay", s.deFront("away"));
    }

    @Test
    public void test2() {
        assertEquals("bay", s.deFront("cbay"));
    }

    @Test
    public void test3() {
        assertEquals("va", s.deFront("java"));
    }

    @Test
    public void test4() {
        assertEquals("a", s.deFront("ad"));
    }

    @Test
    public void test5() {
        assertEquals("a", s.deFront("a"));
    }

    @Test
    public void test6() {
        assertEquals("ab", s.deFront("ab"));
    }
}