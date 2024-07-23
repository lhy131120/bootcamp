import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();

    strings.add("hello");
    strings.add("abc");
    strings.add("def");
    strings.add("af");

    // System.out.println(strings);

    ArrayList<String> strings2 = new ArrayList<>();
    strings2.add("hello");
    strings2.add("abc");
    strings2.add("def");
    // System.out.println(strings2);

    // add
    strings.add("hello");
    strings.add("hello");
    strings2.add("hello");
    strings2.add("hello");

    System.out.println(strings);
    System.out.println(strings2);

    boolean hsResult = strings.add("hello");
    System.out.println(hsResult); // Hashset - not adding duplicati

    System.out.println(strings.size());
    System.out.println(strings.add("sas"));
    System.out.println(strings2.add("sas"));


    // Q1. Remove Dupicat Value
    String [] arr = new String[] {"abc", "def", "xyz", "def"};
    HashSet<String> result =  new HashSet<>();
    // for(int i = 0; i<arr.length; i++) {
    //   result.add(arr[i]);
    // }

    for(String s: arr) {
      result.add(s);
    }

    // Find all Dupicated value;
    ArrayList<String> arrList = new ArrayList<>();
    HashSet<String> result1 =  new HashSet<>();
    for(String s: arr) {
      if(!result1.add(s)) {
        arrList.add(s);
      }
    }
    System.out.println(result1); // ["abc","def", "xyz"]




    // Q3

  }
}
