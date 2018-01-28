package codingbat.Recursion1.array6;

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
        assertEquals(true,s.array6(new int[]{1,6,4},0));
    }

    @Test
    public void test2() {
        assertEquals(false,s.array6(new int[]{1,4},0));
    }

    @Test
    public void test3() {
        assertEquals(true,s.array6(new int[]{6},0));
    }
}