public class DemoEnum {
  // constant
  public static final String monday = "MONDAY";
  public static final String tuesday = "TUESDAY";
  public static final String wednesday = "WEDNESDAY";
  public static final String thursday = "THURSDAY";
  public static final String friday = "FRIDAY";

  public static void main(String[] args) {
    System.out.println(DemoEnum.monday);

    // what happen in heap memory?
    // Answer: static variable would not point to object
    // when main being executed, it loads enum class
    System.out.println(Weekday.MONDAY); // sysout calling Weekday Monday toString()
    System.out.println(Weekday.WEDNESDAY);
  }
}
