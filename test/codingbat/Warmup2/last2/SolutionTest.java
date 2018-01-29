package codingbat.Warmup2.last2;

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
        assertEquals(1,s.last2("hixxhi"));
    }

    @Test
    public void test2() {
        assertEquals(1,s.last2("xaxxaxaxx"));
    }

    @Test
    public void test3() {
        assertEquals(2,s.last2("axxxaaxx"));
    }

    @Test
    public void test4() {
        assertEquals(3, s.last2("xxaxxaxxaxx"));
    }

    @Test
    public void test5() {
        assertEquals(2, s.last2("xxxx"));
    }
}