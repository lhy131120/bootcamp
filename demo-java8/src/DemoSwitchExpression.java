public class DemoSwitchExpression {
  public static enum Color {
    RED, BLACK, YELLOW;
  }
  public static void main(String[] args) {
    Color color = Color.BLACK;

    switch (color) {
      case RED:
        System.out.println("RED");
        break;
      case BLACK:
        System.out.println("BlACK");
        break;
      case YELLOW:
        System.out.println("YELLOW");
        break;
    }


    // Switch Expression -> return something
    // check if all possible enum values is handled
    // No break, because it is for return
    String result = switch (color) {
      case RED -> "RED";
      case BLACK, YELLOW -> "BLACK || YELLOW";
    };


    System.out.println(result);

    // yield
    String result2 = switch (color) {
      case RED -> {
        int x = 3;
        if(x >= 3){
          yield "Red.";
        } else {
          yield "Reddd";
        }
      }
      case BLACK, YELLOW -> "BLACK || YELLOW";
    };
  }
}
