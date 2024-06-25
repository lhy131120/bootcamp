package form;

public class Address {
  private String line1;
  private String line2;
  private String line3;

  //all args contrtuctor
  public Address(String l1, String l2, String l3) {
    this.line1 = l1;
    this.line2 = l2;
    this.line3 = l3;
  }

  // getter

  public String getLine1(){
    return this.line1;
  }
  public String getLine2(){
    return this.line2;
  }
  public String getLine3(){
    return this.line3;
  }

  // setter

  public void setAddress2(String line2) {
    this.line2 = line2;
  }

  public String toString() {
    return "Address is (" + this.line1 + ", " + this.line2 + ", " + this.line3 + ")";
   }
  

  public static void main(String[] args) {
    // Create a Form Object, with Address Object
    Address address = new Address("Hong Kong", "Wong Tai Sin", "Tai Sing Street");
    Address address2 = new Address("Hong Kong", "Wong Tai Sin", "Tai Sing Street");
    
    Form f1 = new Form("Ray", "Lam", address);
    // System.out.println(f1.getfirstName());
    // System.out.println(f1.getlastName());
    // System.out.println(f1.getAddress());

    // *****String + anything => String, so defalut call toString() method
    System.out.println(f1); // 咁啱prtintln會call toString
    System.out.println(f1.toString());

    //f1 call address object, so it can continue to call Address method getLine2()
    System.out.println(f1.getAddress().getLine2()); 

    // 要改變又唔改變原source就需要多一個object, 好似JS的deep copy
    Form f2 = new Form("Amber", "Ho", address2);

    System.out.println(f2.getAddress());
    f1.getAddress().setAddress2("Kolwoon Bay");

    System.out.println(f1.getAddress().getLine2());
    System.out.println(f2.getAddress().getLine2());
  }
}
