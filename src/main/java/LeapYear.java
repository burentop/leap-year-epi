public class LeapYear {
  public boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    } else {
      return year % 4 == 0;
    }
  }
}
