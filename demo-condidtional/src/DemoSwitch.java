import java.util.Scanner;

public class DemoSwitch {
  public static void main(String[] args) {
    char grade = 'U';
    switch(grade) {
      case 'A':
      System.out.println("this is grade " + grade);
      break;
      case 'B':
      System.out.println("this is grade " + grade);
      break;
      case 'C':
      System.out.println("this is grade " + grade);
      break;
      default:
      System.out.println("No Grade");
    }

    if(grade == 'A' || grade == 'B' || grade == 'C' ){
      System.out.println("this is grade " + grade);
    } else {
      System.out.println("no grade");
    }

    // Switch 唔break的話會由case開始，順序落去，
    //有break可以無視case的ordering,反之ordering十分重要！

    // switch 做到OR的效果，可以做到AND嗎

    // Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a number: ");
    int month = input.nextInt();
    System.out.println("month=" + month);
  }
}
