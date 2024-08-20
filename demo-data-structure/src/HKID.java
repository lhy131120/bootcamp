import java.util.HashMap;
import java.util.Objects;

public class HKID {
  private String value;
  
  public HKID(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  @Override 
  public String toString() {
    return "HKID("+ this.value +")";
  }

  // if you don't override equals() and hashCode(),
  // it extends them from Object.class
  // so, we compare "hkid object 1 " and "hkid object 2"

  // if you override equals() and hashCode()

  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;
    if(!(obj instanceof HKID))
      return false;
    HKID hkid = (HKID) obj;
      return Objects.equals(this.value, hkid.getValue()); // 呢個係自定義equals return 
  }

  public int hashCode() {
    return Objects.hash(this.value);
  }

  public static void main(String[] args) {
    // Hashmap 放入去一定係class,
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    // "A1234567" , 34 "John"
    //  H2345678" , 18 "Jenny"
    // for(Map.Entry<String, Customer> entry : customerMap.entrySet()){

    // }

    customerMap.put(new HKID("A1234567"), new Customer(34, "John"));
    
    HKID hkid = new HKID("H2345678");
    Customer customer = new Customer(18, "Jenny");
    customerMap.put(hkid, customer);
    // put() logic: compare

    // duplicated key  "A1234567"
    // put one more customer with same key -> "A1234567", 34, "John"
    // Solve override the equals() and hashcode in Key.Class
    customerMap.put (new HKID("A1234567"), new Customer(21, "Oscar"));

    System.out.println(customerMap);
    System.out.println(new HKID("1234").equals(new HKID("1234")));
    // true, because override

    // put() => use equals() and hashCode()
    // objectives of equals() & hashcode(): identify if they are same object
    // Hasp.class equals() is to identify if they are same key

    // put() program flow: hashmap.put(key, value) => calls key.equals() & key.hashCode()

    // How about HashMap<String, String> ?
    // String.class is already done. you cannot change the implementation of equals() and hashCode()
    // so String.equals()

    System.out.println(new Integer(129).equals(new Integer(129))); // true
    System.out.println(new Integer(129) == (new Integer(129))); // false

  }
}
