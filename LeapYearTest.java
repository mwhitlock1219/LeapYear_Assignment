import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {
//Used FizzBuzz as example
    @Test
    public void IsItALeapYear() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.isLeapYear(1996));
        assertEquals(false, leapYear.isLeapYear(2001));
        assertEquals(true, leapYear.isLeapYear(2000));
        assertEquals(false, leapYear.isLeapYear(1900));
    }
}