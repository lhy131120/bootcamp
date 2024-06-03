public class DemoInteger {
    public static void main(String[] args) {
        int x = 1;
        Integer x2 = 1;

        System.out.println(x);
        System.out.println(x2);

        x = x + 3;
        x -= 10;

        x2 = x2 + 3;
        x2 -= 10;

        // Integer is a wrapper class
        // class has method

        short s = (short) x;

        x2 += 60000;
        short s2 = x2.shortValue(); // overflow, similar to explicit conversion
        System.out.println(s2);

        double d1 = x2.doubleValue();
        System.out.println(d1);

        // Comparsion
        // ( > , < , >= , <=, !=) For Peimtive value only
        // class 用 method 

        Integer x3 = 4;
        Integer x4 = 8;
        Integer x5 = 8;
        boolean result = x4 > x3; //true (compare int value) downgrade左
        // boolean result2 = x4.compareTo(x3) > 0; // compare Integer value

        System.out.println(x4.compareTo(x3)); // 1  安全的寫法
        System.out.println(x4.compareTo(x4)); // -1
        System.out.println(x4.compareTo(x3)); // 0

        // compare Integer value 用緊符號
        boolean result2 = x4.compareTo(x3) > 0; // true
        boolean result3 = x4.compareTo(x3) < 0; // false
        boolean result5 = x4.compareTo(x5) == 0; // true

        // byte, short, Integer, Long, Dpuble, Float
        Float f1 = 10.0f;//
        Float f2 = new Float(10.f); //create float object, storing a float value
        long l2 = f2.longValue();

        Double d3 = new Double("10.324");
        long l3 = d3.longValue();
        System.out.println(l3);


        Character c1 = new Character('a');
        char c2 = Character.toUpperCase('b');  // static method
        System.out.println(c2);
        System.out.println(Character.toLowerCase('M')); //m

        new Boolean(false);
        Boolean b3 = new Boolean(false);
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(true);

        // ============== 重點！！！ wrapper class 用methodn 解決 ＝================

        System.out.println(b3.compareTo(b4)); // -1
        System.out.println(b5.compareTo(b4)); // 0

        System.out.println(b3 == b4); // What !???
        System.out.println(b4 == b5); // What !???


        // autobox and unbox
        Integer i7 = 9; // 9 is an int value ->> autobox >> Integer object
        int i8 = i7; // i7 is Integer object >> unbox >> int value

        Integer i9 = new Integer(9);
        int i10 = i9.intValue();

        Integer i11 = Integer.valueOf(i9); // static method, the result is as same as "new Integer(9)"
        int i12 = Integer.parseInt("10");
        System.out.println(i12); // 10

        int i13 = Integer.parseInt("10a"); //java.lang.NumberFormatException, run先知錯

        System.out.println(new Byte("10"));
        // System.out.println(new byte);

    }
}