package codingbat.Logic1.love6;

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
        assertEquals(true,s.love6(6,4));
    }

    @Test
    public void test2() {
        assertEquals(false,s.love6(4,5));
    }

    @Test
    public void test3() {
        assertEquals(true,s.love6(1,5));
    }
}