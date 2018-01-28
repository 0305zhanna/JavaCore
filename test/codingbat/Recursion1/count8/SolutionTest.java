package codingbat.Recursion1.count8;

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
        assertEquals(1,s.count8(8));
    }

    @Test
    public void test2() {
        assertEquals(4,s.count8(8818));
    }

    @Test
    public void test3() {
        assertEquals(2,s.count8(818));
    }
}