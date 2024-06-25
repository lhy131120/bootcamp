public class Demointeger {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; //3 int value > autobox > Integer object(hemp memony)

    i1 = 127; // i1 (object ref), 127 => (1st) create Integ Object
    i2 = 127; // i2 (object ref), 127 => (2nd) reuse the original Integer Object

    // Rule: from -128 to 127 over左就reuse the original object
    // 唔係check緊127呢個值，佢係check緊object refence
    System.out.println(i1 == i2); // true (are they same object?)

    Integer i3 = 128; //over127 會
    Integer i4 = 128;
    // 唔係check緊佢嘅值 係check object refence
    System.out.println(i3 == i4);

    // Important
    // For Class, you should always compare their objects value by METHOD
    // 所以用 == 去checking, check緊係object ref.

    // Float, Double (No Internal Cache in JVM) 因為 float,double 之間太多小數
    Float f1 = 10.12345f; // autobox: float value => Float Object
    Float f2 = 10.12345f; // autobox: float value => Float Object

    System.out.println(f1 == f2); //false

    // Boolean - support Internal Cache - 數量有限 true or false
    Boolean b1 = true;
    Boolean b2 = true;
    System.out.println(b1 == b2); // true

    // Support Internal Cache -128 to 127
    Character c1 = 'c'; 
    Character c2 = 'c';
    System.out.println(c1 == c2); // true

    Character c3 = '的'; 
    Character c4 = '的';
    System.out.println(c3 == c4);

  }
}
