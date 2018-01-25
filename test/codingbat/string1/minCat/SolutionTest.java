package codingbat.string1.minCat;

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
        assertEquals("loHi", s.minCat("Hello", "Hi"));
    }

    @Test
    public void test2(){
        assertEquals("loHi", s.minCat("lo", "Hi"));
    }

    @Test
    public void test3(){
        assertEquals("javaello", s.minCat("java", "Hello"));
    }
}