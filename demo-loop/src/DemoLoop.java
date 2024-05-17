public class DemoLoop {
    public static void main(String[] args) {

        // 位置1 init； 位置2 continue criteria； 位置3 increamental operation 
        // 1. init i=0
        // 2. check i < 4 ?  => Y
        // 3. print hello
        // 4. i++ become i = 1
        // 5. check i < 4 ? => Y
        // 6. print hello
        // 7. i++ become i = 2
        // 8. check i < 4 ? => Y
        // 9. print hello
        // 10. i++ become i = 3
        // 11. check i < 4 ? => Y
        // 12.  
        // for ( int i = 0; i < 4 ; i ++ ) {
        //     System.out.println("hello");
        // }

        
        for (int i = 0; i < 7; i++) {
            if( i%2 == 0 && i != 0) {
                System.out.println(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
    }
}
