import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {
  public static void main(String[] args) {
    // HashTable (Thread safe) vs HashMap

    Hashtable<String, String> table = new Hashtable<>();
    // HashMap<String> map = new HashMap<>();
    // put() -> 1_000_000
    // 2 thread

    Runnable addHashTable = () -> {
      for(int i = 0; i < 100_000; i++){
        table.put(String.valueOf(i), "hello");
      }

      System.out.println("Hashtable size = " + table.size());
    };
    
    long startTime = System.currentTimeMillis();
    Thread threadHashTable1 = new Thread(addHashTable);
    Thread threadHashTable2 = new Thread(addHashTable);
    threadHashTable1.start();
    threadHashTable2.start();

    try {
      threadHashTable1.join();
      threadHashTable2.join();
      long aftertime = System.currentTimeMillis();
      System.out.println("HashTable runtime = " + (aftertime - startTime) + "ms");
      System.out.println("HashTable.size(): " + table.size());
    } catch (Exception e) {
      // TODO: handle exception
    }

    
    //  =============================================

    Map<String, String> map = new HashMap<>();
    // HashMap<String> map = new HashMap<>();
    // put() -> 1_000_000
    // 2 thread

    Runnable addHashMap = () -> {
      for(int i = 0; i < 100_000; i++){
        map.put(String.valueOf(i), "hello");
      }

      System.out.println("Hashmap size = " + map.size());
    };
    
    startTime = System.currentTimeMillis();
    Thread threadHashMap1 = new Thread(addHashMap);
    Thread threadHashMap2 = new Thread(addHashMap);
    threadHashMap1.start();
    threadHashMap2.start();

    try {
      threadHashMap1.join();
      threadHashMap2.join();
      long aftertime = System.currentTimeMillis();
      System.out.println("HashMap runtime = " + (aftertime - startTime) + "ms");
      System.out.println("HashMap.size(): " + map.size());
    } catch (Exception e) {
      // TODO: handle exception
    }

    // ==========================================

    // null key
    HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(null, "abc");
    map2.put(3, null);

    System.out.println(map2.size());


    Hashtable<Integer, String> table2 = new Hashtable<>();
    // table2.put(null, "def"); // HashTable: key can't be null, nullpointException
    // table2.put(3, null); // Nullpoint Exception
    table2.put(1, "abc");
    table2.put(1, "def");
    System.out.println(table2.get(1));
    System.out.println(table2.size());


  }
}
