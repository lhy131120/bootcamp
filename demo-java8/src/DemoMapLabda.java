import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoMapLabda {

  public static void main(String[] args) {
    Map<String, Customer> customerMap  = new HashMap<>();

    customerMap.put("C1234", new Customer("John"));
    customerMap.put("C1235", new Customer("Sam"));
    
    if(customerMap.containsKey("C1235")) {
      System.out.println(customerMap.get("C1235").getName());
    }

    Function<String, Customer> defaultCustomer = s -> new Customer(s);
    customerMap.computeIfAbsent("C1236", defaultCustomer);

    for(Map.Entry<String,Customer> entry : customerMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // 2. merge -> BiFunction

    Map<String, Integer> map = new HashMap<>();
    map.put("Peter", 10);
    map.put("Jenny", 2);
    map.put("Vic", 100);
    map.put("John", 12);

    map.put("Peter", map.get("Peter") + 2);
    map.put("Jenny", map.get("Jenny") + 2);
    map.put("Vic", map.get("Vic") + 2);
    map.put("John", map.get("John") + 2);


    BiFunction<Integer, Integer, Integer> addValue = (oldVal, newVal) -> oldVal + newVal;
    map.merge("Peter", 3, addValue);

    // UnaryOperator
    // UnaryOperator<String> = Function<String, String>
    UnaryOperator<String>nameFormula = s -> s + "!!!";
    // BinaryOperator<String, String> nameFormula2 = (s1.s2) -> s1 + s2;
    

  }
}

// Function. BiFunction (map.merge, computeIfAbsent)
// Supp;ier