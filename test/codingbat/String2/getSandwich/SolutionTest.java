package codingbat.String2.getSandwich;

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
        assertEquals("",s.getSandwich("xxbreadyy"));
    }

    @Test
    public void test2() {
        assertEquals("jam",s.getSandwich("breadjambread"));
    }

    @Test
    public void test3() {
        assertEquals("jam",s.getSandwich("xxbreadjambreadyy"));
    }

    @Test
    public void test4() {
        assertEquals("",s.getSandwich("xxxxxxxxxxxxxxx"));
    }

    @Test
    public void test5() {
        assertEquals("j",s.getSandwich("breadjbread"));
    }
}