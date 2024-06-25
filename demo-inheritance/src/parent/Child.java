package parent;

public class Child extends Father {

  // implicitly empty constructor
  public Child(String name) {
    // 呢到就算無code都係call緊野
    // super();
    // 因為parent無empty constructor會出事
    super(name);
  }
  public static void main(String[] args) {
    Child c = new Child("Marc");
    Father f = new Father();
    Father f2 = new Child("Ben");
    // Child c2 = new Father();
  }
}
