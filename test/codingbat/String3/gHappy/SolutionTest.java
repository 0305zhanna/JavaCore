package codingbat.String3.gHappy;

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
        assertEquals(true, s.gHappy("xxggxx"));
    }

    @Test
    public void test2() {
        assertEquals(false, s.gHappy("xxgxx"));
    }

    @Test
    public void test3() {
        assertEquals(false, s.gHappy("xxggyygxx"));
    }

    @Test
    public void test4() {
        assertEquals(false, s.gHappy("xxgggxyg"));
    }

    @Test
    public void test5() {
        assertEquals(true, s.gHappy(""));
    }
}