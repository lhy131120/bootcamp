public class demoif {
    public static void main(String[] args) {
        int x;
        x = 3;
        if(x >= 3) {
            System.out.println("x >= 3");
        }

        int y = 2;

        y = -100;

        if(y >= 2) {
            System.out.println("y >= 2");
        } else {
            System.out.println("y <= 2");
        }

        int a = 0;
        int b = 0;
        // print max=

        if(a > b) {
            System.out.println("max=" + a);
        } else {
            System.out.println("max=" + b);
        }
    }
}