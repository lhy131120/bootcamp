package clazz;

import java.util.Objects;

public class Superman extends Person implements Flyable, PowerUp {

  public Superman(String name) {
    super(name);
  }

  public Superman() {
    // super(); // implicitly calling Person()
  }

  @Override
  public void fly() {

  }

  @Override
  public void powerUp() {

  }

  public static void main(String[] args) {

    // Inheritance only for instance method, attribute
    // Do not inherit constructor if you create a constructor with "super" from parent Class
    Superman sm = new Superman("John"); // no name attribute in


    // Polymorphism
    Person p1 = new Superman("Mary");
    // During compile time, p1 cannot fly(), because p1 is declared by Person,
    // which can call the instaned method from Person. class ONLY
    // fly() method is hidden when you use p1 to interact Superman Object
    p1.eat();

    Superman s1 = (Superman) p1; // Parent => Child (Downcast)
    // what is the risk?
    // p1 can be an object created by other class and this class extending
    // Person.class as well
    s1.fly();

    // System.out.println(p1);

    Superman s2;
    if(p1 instanceof Superman) {
      s2 = (Superman) s1;
    }

    // System.out.println(sm);

    Superman sm2 = new Superman("John");
    //equals
    System.out.println(sm.equals(sm2));


    PowerUp superman = new Superman("Sally");
    superman.powerUp();
  }

  //  有equals就有hashCode
  @Override
  public boolean equals(Object obj) {
    // default equal 係垃圾只check地址唔係我哋而家要的野
    if(this == obj) 
      return true;
    if(!(obj instanceof Superman))
     return false;
    Superman sm = (Superman) obj;
    return Objects.equals(super.getName(), sm.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.getName());
  }

  @Override
  public String toString() {
    // 因為呢到無自身attribute, 所以係用super
    return "Superman(" + "person=" + super.toString() +")";
  }
}
