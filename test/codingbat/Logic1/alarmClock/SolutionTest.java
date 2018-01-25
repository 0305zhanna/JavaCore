package codingbat.Logic1.alarmClock;

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
        assertEquals("7:00", s.alarmClock(1,false));
    }

    @Test
    public void test2() {
        assertEquals("7:00", s.alarmClock(5,false));
    }

    @Test
    public void test3() {
        assertEquals("10:00", s.alarmClock(0,false));
    }

    @Test
    public void test4() {
        assertEquals("10:00", s.alarmClock(1,true));
    }

    @Test
    public void test5() {
        assertEquals("off", s.alarmClock(0,true));
    }
}