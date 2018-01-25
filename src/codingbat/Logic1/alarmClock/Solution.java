package codingbat.Logic1.alarmClock;

public class Solution {
    public String alarmClock(int day, boolean vacation) {
        String[] alarmTime = vacation ? new String[]{"10:00", "off"} : new String[]{"7:00", "10:00"};
        return day>0 && day<6 ? alarmTime[0]:alarmTime[1];
    }
}
