package codingbat.Logic1.in1To10;

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
        assertEquals(true,s.in1To10(5,false));
    }

    @Test
    public void test2() {
        assertEquals(false,s.in1To10(11,false));
    }

    @Test
    public void test3() {
        assertEquals(true,s.in1To10(11,true));
    }
}