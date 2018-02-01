package codingbat.String2.endOther;

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
        assertEquals(true,s.endOther("Hiabc", "abc"));
    }

    @Test
    public void test2() {
        assertEquals(true,s.endOther("AbC", "HiaBc"));
    }

    @Test
    public void test3() {
        assertEquals(true,s.endOther("abc", "abXabc"));
    }
}