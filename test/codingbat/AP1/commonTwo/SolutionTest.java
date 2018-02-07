package codingbat.AP1.commonTwo;

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
        assertEquals(2, s.commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));
    }

    @Test
    public void test2() {
        assertEquals(3, s.commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
    }

    @Test
    public void test3() {
        assertEquals(3, s.commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
    }

    @Test
    public void test4() {
        assertEquals(3, s.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));
    }

    @Test
    public void test5() {
        assertEquals(1, s.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b"}));
    }
}