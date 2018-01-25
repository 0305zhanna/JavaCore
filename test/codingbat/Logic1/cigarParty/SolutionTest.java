package codingbat.Logic1.cigarParty;

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
        assertEquals(false, s.cigarParty(30,false));
    }

    @Test
    public void test2() {
        assertEquals(true, s.cigarParty(50,false));
    }

    @Test
    public void test3() {
        assertEquals(true, s.cigarParty(70,true));
    }
}