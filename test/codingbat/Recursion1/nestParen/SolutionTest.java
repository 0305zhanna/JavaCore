package codingbat.Recursion1.nestParen;

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
        assertEquals(true, s.nestParen("(())"));
    }

    @Test
    public void test2() {
        assertEquals(true, s.nestParen("((()))"));
    }

    @Test
    public void test3() {
        assertEquals( false, s.nestParen("(((x))"));
    }
}