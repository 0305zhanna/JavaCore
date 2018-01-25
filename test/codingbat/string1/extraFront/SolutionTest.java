package codingbat.string1.extraFront;

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
        assertEquals("HHH", s.extraFront("H"));
    }

    @Test
    public void test2() {
        assertEquals("", s.extraFront(""));
    }

    @Test
    public void test3() {
        assertEquals("ababab", s.extraFront("ab"));
    }

    @Test
    public void test4() {
        assertEquals("HeHeHe", s.extraFront("Hello"));
    }



}