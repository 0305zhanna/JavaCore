package codingbat.Logic1.caughtSpeeding;

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
        assertEquals(0,s.caughtSpeeding(60,false));
    }

    @Test
    public void test2() {
        assertEquals(1,s.caughtSpeeding(65,false));
    }

    @Test
    public void test3() {
        assertEquals(0,s.caughtSpeeding(65,true));
    }
}