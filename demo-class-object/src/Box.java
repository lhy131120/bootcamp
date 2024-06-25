import java.util.Arrays;

public class Box {

  // Static Variable (belongs to class)
  private static String prefix = "apple"; // 自帶new的時候 已經有
  private String name;
  private String[] strings;

  // default constructor
  public Box() {
    this.strings = new String[0];
  }

  public String[] getStrings() {
    return this.strings;
  }

  public void setString(int index, String s) {
    if( index >= 0 && index < this.strings.length) {
      this.strings[index] = s;
    } else {
      System.out.println("Invalid index");
    }
  }

  public void setName(String name) {
    // 使用prefix，name 組合名稱
    // this.name = Box.prefix.concat("_").concat(name);
    this.name = Box.prefix + " " + name;
  }

  public String toString() {
    return "Box("+ "strings " + Arrays.toString(this.strings) +")";
  }

  public void addString(String s) {

    // 諗張圖！！！
    // 創建一個新的字串陣列，將舊的字串複製到其中，然後添加新的字串

    // 新的字串陣列，字串長度＋1
     String[] arr = new String [this.strings.length + 1];

     //  將舊的字串複製到其中
     for (int i = 0; i < this.strings.length; i++) {
      arr[i] = this.strings[i];
     }
     // 新字串最後，即長度-1
     arr[arr.length - 1] = s;
     this.strings = arr;
  }

  public void deleteString(String s) {
    // carete index to store 

    for (int i = 0; i<this.strings.length; i++) {
      if(this.strings[i].equals(s)){
        
      }
    }

  }

  public static void main(String[] args) {

    // Box box = new Box(new String[] {"AVB", "AVB"}); // Box(Strings[AVB. AVB]) //Array 固定左長度
    Box box1 = new Box(); // 改良，我地需要一個無固定長度的Array
    Box box2 = new Box();

    box1.addString("adas");
    box1.addString("second");
    box1.setString(0, "prefix");

    box2.setString(0, "first");

    System.out.println(box1);
    System.out.println(box2);
  }
}
