package codingbat.string1.frontAgain;

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
        assertEquals(false, s.frontAgain("edit"));
    }

    @Test
    public void test2(){
        assertEquals(true, s.frontAgain("edited"));
    }

    @Test
    public void test3(){
        assertEquals(true, s.frontAgain("ed"));
    }

    @Test
    public void test4(){
        assertEquals(false, s.frontAgain(""));
    }


}