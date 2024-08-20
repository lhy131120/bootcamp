public class DemoDivideByZore {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int amount = 0;
        // divide(10, 0);
        // System.out.println(divide(10, 3)); // 5.0
        // System.out.println(divide(10, amount)); // exception

        // Unchecked Exception(RunTime Exception)
        try {
            divide(10, amount);
            String s  = "hello";
            s = null; // NullPointerException
            System.out.println(s.charAt(4));
        } catch (ArithmeticException e) {
            // System.out.printf("%3d/0", amount);
            System.out.println("ArithmeticException Exist");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Exist");
        }


        double expense = CalExpensePerEmpolee();
        
        try {
            double ex = CalExpensePerEmpolee2();
        } catch (ArithmeticException e ){
            System.out.println("somthing ");
        }

        try {
            CalExpensePerEmpolee3();
        } catch (EmpolyeeCountZeroException e) {
            System.out.println("custom Define Error!!!");
        }
    }

    // retunr int 
    // throw ArithmeticException (Implicitly)
    public static int divide(int x, int y){
        return x / y;
    }

    public static int CalExpensePerEmpolee() {
        try {
            return getDepaetmentExpense() / getEmployeeCount(); // Bug
        } catch (ArithmeticException e) {
            return getDepaetmentExpense(); // fix
        }
    }

    public static int CalExpensePerEmpolee3() {
        try {
            return getDepaetmentExpense() / getEmployeeCount();
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    public static int CalExpensePerEmpolee2() {
        return getDepaetmentExpense() / getEmployeeCount(); 
    }

    public static int getEmployeeCount() {
        return 0;
    }

    public static int getDepaetmentExpense() {
        return 140_000;
    }
}
