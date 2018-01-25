package codingbat.string1.startWord;

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
        assertEquals("hi", s.startWord("hippo", "hi"));
    }

    @Test
    public void test2() {
        assertEquals("hip", s.startWord("hippo", "xip"));
    }

    @Test
    public void test3() {
        assertEquals("h", s.startWord("hippo", "i"));
    }

    @Test
    public void test4() {
        assertEquals("", s.startWord("hippo", "po"));
    }

    @Test
    public void test5() {
        assertEquals("p", s.startWord("p", "p"));
    }

    @Test
    public void test6() {
        assertEquals("po", s.startWord("po", "to"));
    }

    @Test
    public void test7() {
        assertEquals("h", s.startWord("h", "z"));
    }

    @Test
    public void test8() {
        assertEquals("", s.startWord("hippo", "ix"));
    }

    @Test
    public void test9() {
        assertEquals("", s.startWord("", "x"));
    }
}