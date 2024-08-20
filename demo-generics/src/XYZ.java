public class XYZ<T, U> {
  private T t;
  private U u;

  public XYZ() {

  }

  public XYZ(T t, U u) {
    this.t = t;
    this.u = u;
  }

  public void setU(U u) {
    this.u = u;
  }


  public static void main(String[] args) {
    XYZ<String, Customer> str = new XYZ<>();
    // str.setU("null");  // error case 

    XYZ<String, String> strings = new XYZ<>();
  }
}
