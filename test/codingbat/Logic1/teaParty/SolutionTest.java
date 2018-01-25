package codingbat.Logic1.teaParty;

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
        assertEquals(1,s.teaParty(6,8));
    }

    @Test
    public void test2() {
        assertEquals(0,s.teaParty(3,8));
    }

    @Test
    public void test3() {
        assertEquals(2,s.teaParty(20,6));
    }
}