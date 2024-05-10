public class DemoOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        
        --y;
        // System.out.println(x + y);



        long p;
        p = 2L;

        p *= 2;

        p %= 3;
        // System.out.println("p= " + p + ", y= " + y);

        String s = "hello";
        s += " !!!!!";
        // System.out.println("s=" + s);
        
        boolean result = 10 > 3;
        boolean r2 = 10 > 2 && 3 < 6; // True Or False

        char c10 = 'A';
        char c11 = 'B';

        boolean r10 = c10 == c11; // same as JavaScript but no '===' for use, only '=' and '==' nor true also '!=', but no '!=='
        

        // ==================
        // boolean r11 = 10L > 11L || 0.9f > 0.1f;
        boolean r11 = 10L > 11L && 0.9f > 0.1f;

        System.out.println(r11);

    }
}