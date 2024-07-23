public class App {
    public static void main(String[] args) {
        
        long width = 12345678900L;

        // System.out.println(Byte.MIN_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Long.MIN_VALUE);
        // System.out.println(Short.MIN_VALUE);

        byte i = Byte.MAX_VALUE;

        System.out.println(i);

        System.out.println("i = " + (i+ 1)); // because 1 is int, so automatic type conversion
        System.out.println("i = " + (++i)); // overflow, 127 > -128

        float f = 0.5f;
        double b = f * f;

        // System.out.println(Float.MIN_VALUE);
        // double d = 1.2E-320
        
        char ch = 'G';
        char ch1 = 71;
        char ch2 = '\u0047';

        System.out.println((int)'G');
        // System.out.println(ch == ch1);
        // System.out.println(ch == ch2);
        // System.out.println(ch1 == ch2);
        
        int ch3 = 'G';
        // System.out.println(ch3);

    }
}
