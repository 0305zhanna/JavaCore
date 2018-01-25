package codingbat.string1.lastTwo;

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
    public void test1(){
        assertEquals(s.lastTwo("coding"), "codign");
    }

    @Test
    public void test2(){
        assertEquals(s.lastTwo("cat"), "cta");
    }

    @Test
    public void test3(){
        assertEquals(s.lastTwo("ab"), "ba");
    }


}