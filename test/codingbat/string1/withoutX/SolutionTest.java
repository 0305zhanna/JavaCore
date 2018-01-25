package codingbat.string1.withoutX;

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
        assertEquals("hjksjdhf", s.withoutX("hjksjdhf"));
    }

    @Test
    public void test2() {
        assertEquals("Hi", s.withoutX("xHix"));
    }

    @Test
    public void test3() {
        assertEquals("Hi", s.withoutX("Hix"));
    }

    @Test
    public void test4() {
        assertEquals("Hi", s.withoutX("xHi"));
    }
}