package codingbat.String2.repeatEnd;

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
        assertEquals("llollollo",s.repeatEnd("Hello", 3));
    }

    @Test
    public void test2() {
        assertEquals("lolo",s.repeatEnd("Hello", 2));
    }

    @Test
    public void test3() {
        assertEquals("o",s.repeatEnd("Hello", 1));
    }
}