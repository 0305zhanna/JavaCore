package codingbat.String2.prefixAgain;

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
        assertEquals(true,s.prefixAgain("abXYabc", 1));
    }

    @Test
    public void test2() {
        assertEquals(true,s.prefixAgain("abXYabc", 2));
    }

    @Test
    public void test3() {
        assertEquals(false,s.prefixAgain("abXYabc", 3));
    }

    @Test
    public void test4() {
        assertEquals(true,s.prefixAgain("aa", 1));
    }
}