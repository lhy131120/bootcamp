public class Cat {   // Class name  -> Nmar, able describle physcail object
  // String name;
  // state
  private String name;
  private int age;

  // behaviour
  // instance method = Object method 需要用object去dot佢出來
  // SetAge() is a method that can be called by object only
  //  For example , Cat c1 = new Cat()
  // 先義 Cat呢個 template 
  public void SetAge(int age) {
   this.age = age;
  }

  public void SetName (String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }
}
