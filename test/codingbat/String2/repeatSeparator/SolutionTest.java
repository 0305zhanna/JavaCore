package codingbat.String2.repeatSeparator;

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
        assertEquals("WordXWordXWord", s.repeatSeparator("Word", "X", 3));
    }

    @Test
    public void test2() {
        assertEquals("ThisAndThis", s.repeatSeparator("This", "And", 2));
    }

    @Test
    public void test3() {
        assertEquals("This", s.repeatSeparator("This", "And", 1));
    }

    @Test
    public void test4() {
        assertEquals("", s.repeatSeparator("AAA", "", 0));
    }
}