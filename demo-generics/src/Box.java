public class Box<T> { // <T> just like 未知 & any Type; same TypeScript; T is class 
  private T value;

  public Box() {

  }

  public Box (T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  // The T declared in static method has NO relationship to the T declared in attribute
  // public static <T> Box<T> createbox(T value) {
  //   return new Box<>(value);
  // }

  public static void main(String[] args) {
    // Run time 
    // You have to define the type <t> during run-time
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(123);
    Box<Customer> customBox = new Box<>();
    customBox.setValue(new Customer());

    Box<String> stringBox = Box.createbox("hello");
    // Box<Bird> 
  }

  private static Box<String> createbox(String string) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createbox'");
  }
}
