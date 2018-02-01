package codingbat.String2.xyzMiddle;

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
        assertEquals(true,s.xyzMiddle("AAxyzBB"));
    }

    @Test
    public void test2() {
        assertEquals(true,s.xyzMiddle("AxyzBB"));
    }

    @Test
    public void test3() {
        assertEquals(false,s.xyzMiddle("AxyzBBB"));
    }

    @Test
    public void test4() {
        assertEquals(true,s.xyzMiddle("AAxyzB"));
    }

    @Test
    public void test5() {
        assertEquals(false,s.xyzMiddle("AAAxyzB"));
    }

}