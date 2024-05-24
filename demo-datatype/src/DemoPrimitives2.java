public class DemoPrimitives2 {
  public static void main(String[] args) {
    long l1 = 10;   //本質是int
    long l2 = 10L;  // long value
    long l3 = 10l;  // 太似1  avoid to use



    //Java: int > long

    long l4 = 63; // assign int value 63 to long variable l4 

    // rule  唔準
    // float f3 = 1.9d 

    byte b1 = 10; // 特別例子 在byte 

    // 唔想down grade 原因是精準度損失
    float f3 = (float) 1.9d; // downcast (overflow / precision loss)


    // ======= REMINd : Java 只關心type可唔可以放入目標type的Range,它不關心值, 它希望 lowRisk
    // ======= Java 只關心 Low RISK! Low Risk! Low Risk!
    short s1 = 129;
    byte b2 = (byte) s1; //Java doesn't know s1 is 128 during compile time
    System.out.println("b2 " + b2); // byte -127 -127
    //******** overflow 的例子 **********/


    double d4 = 10.9d;
    int i2 = (int) d4;
    System.out.println("i2=" + i2); //10 -> precision loss

    char c1 = 'a'; // 97
    char c2 = 'A'; // 65

    // char可以比較大小，因為ASCII代表
    if(c1 > c2 ) { // true 97 > 65
      System.out.println("c1 > c2 " + c2); // String + char = String
      System.out.println("c1=" + (int) c1);
      System.out.println("c2=" + (int) c2);
    }

    int val = c1; // OK, low risk cahr -> int (upcast)
    int charVal = 97;
    char c3 = (char) charVal;


    char c4 = '你';
    int c5 = c4;
    System.out.println("c5="+ (int)c4);

    char Char = 'a' + 1;
    System.out.println("Char=" + Char);

    char c6 = 1234;
    System.out.println(c6);

    short a = (byte) 128; // 本身128係int int > byte > short

    byte value = 127;

  }
}
