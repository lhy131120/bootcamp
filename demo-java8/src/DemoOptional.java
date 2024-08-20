import java.lang.StackWalker.Option;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    String s = "hello";
     s = null;
     generate(s); // OK

     // method user
    // Optional 用在method
    // Aim of Optional used to return type
     char tgt = ' ';
     Optional<String> result = generate2(s);
     if(result.isPresent()) { // not null
      result.get().charAt(0);
     } else {
      tgt = '_';
     }

    //  generate(s).get();

    // Ways to create Optional
    // of(null)會報錯; 
    // 唔肯定null定唔null就用ofNullable;
    Optional<String> s2 = Optional.ofNullable(null);
    s2 = Optional.ofNullable("abc");
     System.out.println(s2); // Optional[abc]
     Optional<String> optString = Optional.empty();


     // ifPresent() => Lamda Expression
     // s is String, already, but not Optional<String>


    //  =============== ifPresent 比 isPresent 彈性，某程度上全部用ifPresent都可以
     tgt = ' ';
     int x = 0;
     generate2("abc").ifPresent(string -> {
      // tgt = s.charAt(0);  // Stream, that can't modify out of this scope, but read can.
      // System.out.println(tgt);
      System.out.println(x);
      string.charAt(0);
     });


    //  ＝========================================
    // 有可能無符合的例子
    List<Customer> customers = Arrays.asList(new Customer("John", 13), new Customer("Sally", 15), new Customer("Ben", 18));
    Optional<Customer> optcustomer = customers.stream().filter(customer -> customer.getAge() > 15).findFirst();
    optcustomer.ifPresent(c -> System.out.println(c.toString()));


    //   用isPresent要先if else  判斷一啲野 
    // customers.stream().filter(customer -> customer.getAge() > 50).findFirst().get(); // Java.NoSuchElementException

    //  way to take out the element from optional object
    // 1. isPresent()
    // 2.ifPresent()

    Optional<Customer> optcustomer2 = Optional.of(new Customer("Mary", 21));
    Customer customer = optcustomer2.orElse(new Customer("Susan", 29));

    System.out.println(customer);

    Customer customer2 = optcustomer2.orElseThrow(() -> new RuntimeException());

    Customer customer3 = optcustomer2.orElseGet(() -> new Customer("dummy", 99));
    System.out.println(customer3);


    // 
    Optional<String> optCustomer4 = null;
    optCustomer4.orElse("hello"); // NPE

    //  Optional<String> optCustomer5 = 
  }

  // Method Author
  public static String generate(String s ) {
    if(s == null)
      return null;
    return s.replace('a', 'b').toUpperCase();
  }

  public static Optional<String> generate2(String s) {
    if(s == null)
      return Optional.ofNullable(null);
    return Optional.of(s.replace('a', 'b').toUpperCase());
  }
}
