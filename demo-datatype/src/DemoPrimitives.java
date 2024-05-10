public class DemoPrimitives {
    public static void main(String[] args){
        int x = 3;
        // data type base on declaring 
        // Java係強type, integer type just for integer 
        int z = -9;
        int total = x + z * x - z / z^z;
        int a = 32 / x;
        System.out.println(total);
        System.out.println(a);

        // 2024-5-10
        double d1 = 10.2;
        double d2 = -10.2123;

        double result = d1 + d2;
        System.out.println(result);


        // ================== will have issue in some scenario
        double re3 = 0.1 + 0.2;
        System.out.println(re3);  //0.30000000000000004

        // Java 世界 type 有階級分  double > int

        int f1 = 7;
        double f2 = 8.8;

        double f3 = f1 + f2; // type int + double  trun to => double(7.0) + double(8.8), but f3 type is int that can't store type double value

        char c = 'H';

        // long, byte, short
        // byte only store value from -128 to - 127
        byte x1 = -128;
        byte x2 = 127;
        //byte x3 = 128; // compile error 

        short s1 = -32768;

        long l2 = 1231313L;  // L means a way to specify this value is a long value

        // number with decimal
        // 1. 10.2 -> default is double value
        // 2. low level datatype can't store to high level datatype 
        double d10 = 10.2;
        // float dc9 = 10.1323; because of Rule 2 double type > float type
        // we can
        float dc9 = 10.2f; // add "f" behind the value like type long add "L"

        int dkd;     // var declaration
        int d2d = 9; // var assignment
        
        
    }
}
