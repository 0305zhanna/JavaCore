package codingbat.Warmup2.altPairs;

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
        assertEquals("kien",s.altPairs("kitten"));
    }

    @Test
    public void test2() {
        assertEquals("Chole",s.altPairs("Chocolate"));
    }

    @Test
    public void test3() {
        assertEquals("Congrr",s.altPairs("CodingHorror"));
    }
}