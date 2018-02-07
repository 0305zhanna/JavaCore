package codingbat.String3.withoutString;

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
        assertEquals("He there",s.withoutString("Hello there", "llo"));
    }

    @Test
    public void test2() {
        assertEquals("Hllo thr",s.withoutString("Hello there", "e"));
    }

    @Test
    public void test3() {
        assertEquals("Hello there",s.withoutString("Hello there", "x"));
    }

    @Test
    public void test4() {
        assertEquals("x",s.withoutString("xxx", "xx"));
    }
}