package codingbat.Recursion1.array11;

import org.junit.Before;
import org.junit.Test;

import java.net.Socket;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(1,s.array11(new int[]{1,2,11},0));
    }

    @Test
    public void test2() {
        assertEquals(2,s.array11(new int[]{11,11},0));
    }

    @Test
    public void test3() {
        assertEquals(0,s.array11(new int[]{1,2,3,4},0));
    }
}