package codingbat.String2.catDog;

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
        assertEquals(true,s.catDog("catdog"));
    }

    @Test
    public void test2() {
        assertEquals(false,s.catDog("catcat"));
    }

    @Test
    public void test3() {
        assertEquals(true,s.catDog("1cat1cadodog"));
    }
}