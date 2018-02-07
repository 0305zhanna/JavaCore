package codingbat.String3.equalIsNot;

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
        assertEquals(false, s.equalIsNot("This is not"));
    }

    @Test
    public void test2() {
        assertEquals(true, s.equalIsNot("This is notnot"));
    }

    @Test
    public void test3() {
        assertEquals(true, s.equalIsNot("noisxxnotyynotxisi"));
    }
}