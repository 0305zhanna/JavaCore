package codingbat.String2.countCode;

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
        assertEquals(1,s.countCode("aaacodebbb"));
    }

    @Test
    public void test2() {
        assertEquals(2,s.countCode("codexxcode"));
    }

    @Test
    public void test3() {
        assertEquals(2,s.countCode("cozexxcope"));
    }
}