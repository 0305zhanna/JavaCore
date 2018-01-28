package codingbat.Recursion1.changeXY;

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
        assertEquals("codey", s.changeXY("codex"));
    }

    @Test
    public void test2() {
        assertEquals("yyhiyy", s.changeXY("xxhixx"));
    }

    @Test
    public void test3() {
        assertEquals("yhiyhiy", s.changeXY("xhixhix"));
    }
}