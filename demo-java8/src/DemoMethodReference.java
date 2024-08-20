import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(3, 7, -5,100);

    // Lambda
    integers.stream().forEach(e -> System.out.println(e));
    // method reference
    integers.stream().forEach(System.out::println);


    
    // Example 2
    String s = "vincent";
    // Lambda 
    Supplier<Integer> nameLength = () -> s.length();
    // Method Reference
    Supplier<Integer> nameLength2 = s::length;


    // Example 3 - instance method with two para
    // Lambda
    Comparator<Integer> sortBy = (i1, i2) -> i1.compareTo(i2);
    Comparator<Integer> sortBy2 = Integer::compareTo;

    // Example 4 - constructor
    Function<String, String>stringConstructor = s2 -> new String(s2);
    // method reference
    Function<String, String>stringConstructor2 = String::valueOf;
    Function<String, String>stringConstructor3 = String::new;
  }
}
