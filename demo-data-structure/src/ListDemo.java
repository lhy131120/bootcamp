import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDemo {
  public static void main(String[] args) {
    // List can't new, because it's an interface not class
    List<String> strings = new ArrayList<>();
    strings.add("hello");
    strings.add("abc");
    strings.remove("abc");
    // Array.class implements List .class

    // ArrayList .class has All methods defined in List.class
    // ArrayList may implement more than one interface
    // M have its own interface 


    // Polymorphism
    // 1. scope of Strings(obj, ret) - compile time
    // 2.method implementation - ren tir e 


    // 窄的指針
    // collection.class 窄的拍針
    Collection<String> string2 = new ArrayList<>();
      string2.add("hello");
      string2 = new HashSet<>();
      System.out.println(string2.size()); // 0 指針指的對象唔 

      // Set.class
      Set<String> string3 = new HashSet<>();
      // string3 = new ArrayList<>() // NOT OK, ArrayList.class didn't 

      Map<String, String> nameMap = new HashMap<>();
    
  }
}
