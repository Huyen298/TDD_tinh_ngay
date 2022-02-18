import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    public void nextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected,result);
    }
    @Test
    public void lastDay() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected,result);
    }
    @Test
    public void day30month4year2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected,result);
    }
    @Test
    public void day28month2year2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected,result);
    }
    @Test
    public void day29month2year2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected,result);
    }
    @Test
    public void day31month12year2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected,result);
    }
}