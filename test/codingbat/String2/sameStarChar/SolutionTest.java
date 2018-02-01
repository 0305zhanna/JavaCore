package codingbat.String2.sameStarChar;

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
        assertEquals(true,s.sameStarChar("xy*yzz"));
    }

    @Test
    public void test2() {
        assertEquals(false,s.sameStarChar("xy*zzz"));
    }

    @Test
    public void test3() {
        assertEquals(true,s.sameStarChar("*xa*az"));
    }
}