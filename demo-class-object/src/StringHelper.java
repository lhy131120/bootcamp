public class StringHelper {
  private String str;

  public StringHelper(String str) {
    this.str = str;
  }

  public int length() {
    return str.length();
  }

  // instance method
  public StringHelper setChatAt(int index, char ch) {
    String s = new String("");
    for(int i = 0; i < this.str.length(); i++){
      if (i == index)
        s += ch;
      else 
        s += this.str.charAt(i);
     }
    this.str = s; // 修改自己 
    return this;
  }

  public String toString() {
    return this.str;
  }

  public StringHelper append(String s) {
    this.str += s;
    return this;
  }

  public String subString(int startIndex, int endIndex) {
    String s = new String("");
    for(int i = startIndex; i < endIndex; i++) {
        s += this.str.charAt(i);
      }
      return s;
  }

  public static void main(String[] args) {
    StringHelper sh = new StringHelper("hello");
    sh.setChatAt(3, 'a');
    System.out.println(sh.toString()); // helao

    sh.append("world");
    System.out.println(sh.toString());


    sh.append("!!!").append(" ");
    // System.out.println(sh.toString());
    System.out.println(sh.toString());
  }
}
