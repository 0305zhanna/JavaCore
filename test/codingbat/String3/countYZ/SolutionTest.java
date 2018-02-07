package codingbat.String3.countYZ;

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
        assertEquals(2, s.countYZ("fez day"));
    }

    @Test
    public void test2() {
        assertEquals(2, s.countYZ("day fez"));
    }

    @Test
    public void test3() {
        assertEquals(2, s.countYZ("day fyyyz"));
    }

    @Test
    public void test4() {
        assertEquals(2, s.countYZ("day cat fyyyz"));
    }

    @Test
    public void test5() {
        assertEquals(2, s.countYZ("!!day--yaz!!"));
    }
}