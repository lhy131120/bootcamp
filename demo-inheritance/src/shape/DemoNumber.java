package shape;

public class DemoNumber {
  public static void main(String[] args) {
    Integer x = 1;
    Double d = 2.0;

    // 呢到n係 parent 指針，指住child member x or d 
    Number n = x; //polymorphism

    Number[] numbers = new Number[] {1,2,3,4.0,5.2, (byte)1, (short)3, 4L};
    Double[] doubles = new Double[] {Double.valueOf(1),4.0,5.2}; // int -> Integer(autobox)

    // Integer ~ Double (no relationship)
    // int vs double (upcast)

    // for (object type : array object)
    // Number 喺指針 指住D child object numbers
    for(Number num : numbers) {
      System.out.println(num.getClass());
    }
  }
}
