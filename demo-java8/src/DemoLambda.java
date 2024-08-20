import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
    public static void main(String[] args) {
        Swimable p = new Swimable() {
            @Override 
            public void swim() {
                System.out.println("I am swimming....");
            }
        };
        // p.swim();

        // Lambda expression
        // same as JS arrow function
        Swimable person = () -> System.out.println("I am swimming...");
        person.swim();

        person = () -> System.out.println("I am Swim!!!!");
        person.swim();

        Calculator sumCalculator = (x,y) -> x + y;
        Calculator multiplyCalculator = (x,y) -> x * y;

        System.out.println(sumCalculator.calculate(10, 3));
        System.out.println(multiplyCalculator.calculate(10, 3));

        // More than One line of implementation
        // the return keyword within the implemention block
        Drivable father = x -> {
            if(x == 3)
                return false;
            return true;
        };

        System.out.println(father.drive(3));
        System.out.println(father.drive(4));

        //for loop
        List<String> strings = new LinkedList<>();
        strings.add("abc");
        strings.add("def");
        for(String s: strings) System.out.println(s);

        // Java 8 forEach
        strings.forEach(s -> System.out.println(s));
        strings.forEach(s -> {
            int x = 4;
            if (x > 3) {
                System.out.println(s);
            } else {
                System.out.println("hello");
            }
        });

        // One input One output
        Function<Customer, Integer> nameLength = customer -> customer.getName().length();

        Function<Customer, String> greetingMessage = customer -> {
            String message = "Hello eveyone. I am ".concat(customer.getName());
            return  message;
        };

        // Two input One output
        BiFunction<String , String, Integer> nameLength2 = (name1, name2) -> name1.length() + name2.length(); 
        Integer i = nameLength2.apply("FristName", "LastName");
        System.out.println(i);


        Consumer<Customer>printCustomerName = customer -> System.out.println(customer.getName());
        printCustomerName.accept(new Customer("Jenny"));

        BiConsumer<Integer, Integer> twoSum = (n1, n2) -> System.out.println(sum(n1,n2));

        MathOperation operation = MathOperation.MULTIPY;
        BiConsumer<Integer, Integer> calculate = null;
        switch (operation) {
            case SUM:
                calculate = (n1, n2) -> System.out.println(n1 + n2);
                break;
            case SUBTRACT:
                calculate = (n1, n2) -> System.out.println(n1 - n2);
                break;
            case MULTIPY:
                calculate = (n1, n2) -> System.out.println(n1 * n2);
                break;
            case DIVIDE:
                calculate = (n1, n2) -> System.out.println(n1 / n2);
                break;
        }
        calculate.accept(10, 3);

        // Supplier
        //generate Random Number
        Supplier <Integer> generateNumber = () -> new Random().nextInt(49) + 1;
        List<Integer> marksix = new LinkedList<>();
        int ball = -1;
        while (marksix.size() < 6) {
            ball = generateNumber.get();
            if(marksix.contains(ball))
                continue;
            marksix.add(ball);
        }
        System.out.println(marksix);

        // Predicate
        Predicate<Customer> isNameToo = customer -> customer.getName().length() > 5;
        System.out.println(isNameToo.test(new Customer("May")));
        System.out.println(isNameToo.test(new Customer("Maychan")));

        // Bi]]
        BiPredicate<String, String> isNameTooLong = (n1, n2) -> n1.length() + n2.length() > 9;
        System.out.println(isNameTooLong.test("kspd", "dsadsada"));
    }

    public static int sum(int name1 , int name2) {
        return name1 + name2;
    }
}
