import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    // samilar valueOf
    LocalDate ld = LocalDate.of(2024, 5, 5); //入錯會唔Exception

    ld = ld.plusDays(1L); // 加一日， input係L
    ld = ld.plusMonths(1L);
    ld = ld.plusYears(1L);
    ld = ld.plusWeeks(1L);

    ld = ld.minusDays(100L);

    System.out.println(ld.getMonth());
    Month month = ld.getMonth();
    String monthString = month.toString();
    System.out.println(monthString.toLowerCase());
    System.out.println(ld.getDayOfWeek().toString().toLowerCase());
  }
}
