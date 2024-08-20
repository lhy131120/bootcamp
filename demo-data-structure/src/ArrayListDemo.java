import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        Integer[] integers = new Integer[] {2, 10, -4};
        int sum = 0;
        for (Integer i: integers) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();

        // ArrayList

        // () 代表call constructor of ArrayList.class
        ArrayList<Integer> integers2 = new ArrayList<Integer>();

        // Different between Integer[] and ArrayList<Integer>
        integers2.add(2);
        integers2.add(10);
        integers2.add(-4);
        sum = 0;
        for(Integer i : integers2) {
            sum += i;
        }
        System.out.println(sum);

        // Difference between array and arraylist
        // 1. Initialization: Array (fixed length), ArrayList (variable length)
        // 2. Underlying structure: Array just is array, isn't a Class; ArrayList is a Class

        System.out.println(integers2.size()); // 3 - array.length

        integers2.remove(1);
        // System.out.println(integers2); // [2, -4]

        integers2.set(1, -100); 
        // System.out.println(integers2); // [2, -100]

        // System.out.println(integers2.contains(2)); // true 包含2?

        integers2.add(2);
        // System.out.println(integers2.indexOf(2)); // true return current index; false return -1
        // System.out.println(integers2.lastIndexOf(2));
        // System.out.println(integers2.subList(1, 3)); // [-100, 2]

        // addAll()
        ArrayList<Integer> integers3 = new ArrayList<>();
        // System.out.println(integers3.isEmpty()); // true
        integers3.addAll(integers2);
        // System.out.println("integer3 is " + integers3);

        // right hand slide can skip the type, but left hand slide must 
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("!!!");
        strings.add("Jack");
        strings.remove(1); // ["hi", "Jack"]
        strings.add("hi");
        strings.remove("hi"); // ["Jack"] // remove frist equals
        // System.out.println(strings);


        // Q1, Given String[], remove those string with length > 3
        String[] stringArray = new String[] {"anc", "a", "", null, "aaaa"};
        ArrayList<String> result = new ArrayList<>();
        // loop
        for(String s : stringArray) {
            System.out.println(s);
            // result.add()
            if(s !=null && s.length() > 3) {
                result.add(s);
            }
        }
        // System.out.println(result);  // ["aaaa"]


        // Q2
        // Given Customer[], retrieve all customer object woth age > 30 or name StartsWith "J"
        Customer[] customers = new Customer[] {
            new Customer(40, "Mary"), 
            new Customer(31, "John"), 
            new Customer(29, "Jason"), 
            new Customer(19, "Bonnie")
        };
        ArrayList<Customer> customList = new ArrayList<>();
        
        for(Customer c : customers) {
            if(c.getAge() > 30 || (c.getName() != null && c.getName().startsWith("J")));
            customList.add(c);
        }

        System.out.println(customList);


        ArrayList<Object> objects = new ArrayList<>();
        objects.add("abc");
        objects.add(1);
        objects.add(LocalDate.of(2024, 5, 22));
        objects.add(new HKID("A1234567"));
        // print 
        // check if the different


        // Polymorphism Part 2: runtime => implementation
        // **************Important****************
        for (Object object : objects) {
            // runtime 果刻先知道佢係用緊String Object的 equals,否則最原本object的
            //只係check refence, 所以關鍵在於執行果下
            if(object.equals(new String("abc"))){ // String object equals
                System.out.println("hello");
            } else if(object.equals(new HKID("A1234567"))) { //HKID object equals
                System.out.println("hello2");
            } else if(object.equals(new Integer(1))) { //HKID object equals
                System.out.println("hello3");
            }
        }
    }
}
