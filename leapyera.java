// leap year check 

public class leapyera {
  public static boolean doesLeapYear(int year) {
    return (year % 400 == 0) || ((year % 100) != 0 && (year % 4 == 0));
  }

  public static void main(String[] args) {
    System.out.println(doesLeapYear(2016));
    System.out.println(doesLeapYear(2222));
    System.out.println(doesLeapYear(1600));
    System.out.println(doesLeapYear(1900));
  }
}