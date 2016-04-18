import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_forNumberDivisiableByFour_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2012));
  }

  @Test
    public void isLeapYear_forNumbersNotDivisiableByFour_false() {
      LeapYear leapYear = new LeapYear();
      assertEquals(false, leapYear.isLeapYear(1999));
    }

    @Test
     public void isLeapYear_forMultiplesOfOneHundred_false() {
        LeapYear leapYear = new LeapYear();
        assertEquals(false, leapYear.isLeapYear(1900));
      }
}
