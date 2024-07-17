public class PrimitiveDemo {
  public static void main(String[] args) {
    // left hand slide / right hand slide
    int x = 10; // x: variable; 10: int value // compiler check if 10 can be assigned to x;
    long l = x; // long range is higher than int value(upcast/ promotion)

    short s = (short)x; // short type is lower than int type(downcast => explicit casting)
    // As a developer, you decided to adopt the risk of precision loss
    // compiler dose not concern the value assigned to x during compile time
    // instead , it concerns the "range" of type only

    // ascii
    int y = 100;
    // char c = y;

    // default value;
    long l2;  // Declaration
    // l2 = 0L;
    // System.out.println(l2);

    float f = 0.3f; // we need use f after 0.3, because 0.3 is a double value by default

    long l3 = 7L;

    byte b = 9; //＊＊＊ JAVA still allow int value assigned to byte, short 

    double d = 9.3;
  }
}
