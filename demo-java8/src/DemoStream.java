import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    strings.add("Jone");
    strings.add("Jone1");
    strings.add("Jone2");


    // forEach
    strings.forEach(s->System.out.println(s));


    // for(String s : stings)
    for(int i = 0; i < strings.size(); i++) {
      strings.set(i, strings.get(i).toLowerCase());
    }

    System.out.println(strings);

    List<String> capNames = strings.stream() // List<String> -> Stream<String>
    .map(s -> s.toUpperCase()) // Stream<String>
    .collect(Collectors.toList()); // [JOHN, JENNY, SAM]

    System.out.println(capNames);

    capNames.add("Jone2");
    System.out.println(capNames);

    Set<String> capNames2 = capNames.stream()
    .map(s -> {
      String newStr = s.toLowerCase() + s.toUpperCase();
      return newStr + "!!!";
    }).collect(Collectors.toSet());

    System.out.println(capNames2);

    // ======================
    List<Customer> customers = new LinkedList<>();
    customers.add(new Customer("John", 20));
    customers.add(new Customer("Benny", 35));
    customers.add(new Customer("Kit", 43));

    // filter age 25 or above;
    List<Customer> customersAfterFilter = customers.stream()
      .filter(customer -> customer.getAge() > 25)
      .collect(Collectors.toList());

      System.out.println(customersAfterFilter);


      List<String> names = customers.stream()
        .filter(c -> c.getName().length() >= 4)
        .map(c -> c.getName())
        .collect(Collectors.toList());

        System.out.println(names);


        List<String>nameList = new ArrayList<>();
          // System.out.println(i);
          for(Customer c: customers){
            if(c.getName().length() >= 4) {
              nameList.add(c.getName());
            }
          }
        System.out.println(nameList);

        // filter()  -> map()
        customers.stream()
          .map(c -> c.getName())
          .filter(str -> str.length() >= 4)
          .collect(Collectors.toList());

        // map() filter()
        customers.stream()
          .filter(c -> c.getName().length() >= 4)
          .map(c -> c.getName())
          .forEach(name -> System.out.println(name));

        //count
        customers.stream()
        .filter(c -> c.getAge() < 40)
        .count(); // long 2

        customers.add(new Customer("Banny", 40));

        // Remove depilicated
        List<Customer> abc = customers.stream().distinct().collect(Collectors.toList());
          System.out.println(abc);


        List<String> sortList = customers.stream()
          .filter(c -> c.getAge() < 40)
          .sorted((c1,c2) -> c1.getAge() < c2.getAge() ? -1 : 1)
          .map(c -> c.getName())
          .collect(Collectors.toList());

        System.out.println("Sort List is: " + sortList);

        // Terminal Operaton, (collect(). count() ) -> return non-Stream
        // 每一個Stream只可以做一次terminal

        Stream<Customer> customerList = customers.stream()
          // c.getName().equals("John") // Null Poninter exception

          // 所以Hard Code, target放前邊
          .filter(c -> !"John".equals(c.getName()));

          System.out.println(customerList.count());


          List<String> animals = Arrays.asList("Lions", "Tigers", "Bears");
          // From List to Stream to Map
          Map<String, Integer>animalsMap = animals.stream()
            .collect(Collectors.toMap(s -> s, s -> s.length())); // Map (Key, Value)

            System.out.println(animalsMap);


          List<Staff> staffs = 
          Arrays.asList(new Staff("HR", "John"), new Staff("IT", "Peter"), new Staff("MKT", "Sally"), new Staff("IT", "Ray"));
          // Map<String> List<Staff>
          Map<String, List<Staff>> staffMap = staffs.stream()
          .collect(Collectors.groupingBy(staff -> staff.getDepartment()));

          System.out.println(staffMap.get("IT"));

          // For Loop Answer
          // contains

          List<Staff> staffList = 
          Arrays.asList(new Staff("HR", "John", 30000), new Staff("IT", "Peter", 40000), new Staff("MKT", "Sally", 25000), new Staff("IT", "Ray", 50000));

          Map<String, Integer> deptMap = staffList.stream()
          .collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors.summingInt(s -> s.getSalary())));

          System.out.println(deptMap.get("IT"));
          System.out.println(deptMap.get("MKT"));
          System.out.println(deptMap.get("HR"));


          // Steam Object by initial values
          Stream <Integer> integers = Stream.of(4,3,1,2,5);

          Stream<Staff> staff = Stream.empty();

          // Stream: filter, distinct => Reduce El

          // Special Case
          List<Integer> int2 = Stream.of(2,3,4).map(i -> i + 1).collect(Collectors.toList());

          // map() -> interminate operation -> it won't execute until terminal operation

          // 
          
  }
}
