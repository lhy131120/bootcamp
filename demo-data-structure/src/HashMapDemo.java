import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    // Key & value pair
    // HashMap<Integer, Customer> nameMap = new HashMap<>();
    HashMap<Integer, String> nameMap = new HashMap<>();
    //  key -> Integer,  value -> String
    nameMap.put(100, "Vincent");
    // nameMap.put("Vincent", 100) // NOT OK, violate the hashmap definition

    // We can get value by KEY
    System.out.println(nameMap.get(100));

    // Can get key by Value
    System.out.println(nameMap.get("vincent")); // null

    // No ordering 
    nameMap.put(1010, "Cindy");
    nameMap.put(-45, "Mary");
    System.out.println(nameMap.get(-45));

    // Key + Value -> Entry
    // A map consists of many entries

    // For Loop -> HashMap.class
    // loop for entries

    for(Map.Entry<Integer, String> entry : nameMap.entrySet()) {
      System.out.println("key = " + entry.getKey() + ", value = " +entry.getValue());
    }

    // handle duplicated key -> overwrite the value if the key exists
    nameMap.put(1010, "Peter");
    System.out.println(nameMap);

    // null
    nameMap.put(null, "Monster");
    nameMap.put(-45, "");

    System.out.println(nameMap);
    
    nameMap.remove(-45);
    System.out.println(nameMap);

    String _customName =nameMap.remove(1010);
    System.out.println(nameMap);
  }
}
