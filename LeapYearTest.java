import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void IsItALeapYear() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.isLeapYear(1996));
        assertEquals(false, leapYear.isLeapYear(2001));
        assertEquals(true, leapYear.isLeapYear(2000));
        assertEquals(false, leapYear.isLeapYear(1900));
    }
}