package codingbat.Warmup2.stringYak;

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
        assertEquals("pak",s.stringYak("yakpak"));
    }

    @Test
    public void test2() {
        assertEquals("pak",s.stringYak("pakyak"));
    }

    @Test
    public void test3() {
        assertEquals("123ya",s.stringYak("yak123ya"));
    }
}