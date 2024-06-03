public class DemoMath {
   public static void main(String[] args) {
    // Math.abs()
    int x = -3;
    int y = 8;
    int result = Math.abs(x * y);
    System.out.println(result);

    double d = 3.3d;
    double d2 = Math.abs(d * x); //double * int >> double

    long l = 9L; 
    long result3 = Math.abs(l * x);
    System.out.println(result3);


    // Math.max() 比較最大
    int[] arr = new int[] {-4, 3, 19, 1};
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++) {
        max = Math.max(max, arr[i]);
    }

    // Math.round()


    System.out.println(max); // square

    double d4 = Math.pow(2, 3);
    System.out.println(d4); // 8.0

    System.out.println(Math.sqrt(25));
    System.out.println(Math.sqrt(24));


    System.out.println(Math.round(Math.random() * 100));

   }
}
