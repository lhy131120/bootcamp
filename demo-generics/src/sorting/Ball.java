package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import shape.Bird;

// learn existing interface
public class Ball implements Comparable<Ball>{
  private int number;
  private Color color;

  public Ball(int number, Color color) {
    this.number = number;
    this.color = color;
  }

  public int getnumber() {
    return this.number;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public int compareTo(Ball ball) {
    // Provide my own formula to sort the List<Ball>
    // Return value only 1 and -1

    // example 1: sort by nember (descending)
    // You have 2 ball object reference here: ball and this
    // -1 means " move to left" (from left to right)
    
    
    // return this.number > ball.getnumber() ? -1 : 1; //普通sort
    if (ball != null && this.number > ball.getnumber())
      return -1;
     return 1;  
  }

  @Override
  public String toString() {
    return "Ball("
          + "number, "+ this.number
          + " color, "+ this.color
          + ")";
  }


  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(10, Color.BLACK));
    balls.add(new Ball(9, Color.BLACK));
    balls.add(new Ball(100, Color.BLACK));
    balls.add(new Ball(14, Color.WHITE));
    balls.add(new Ball(8, Color.RED));
    balls.add(new Ball(0, Color.RED));
    balls.add(new Ball(10, Color.RED));
    balls.add(new Ball(2, Color.WHITE));

    // sort by color

    System.out.println(balls);

    // Sort
    // Collection.sort() => call loop List<Ball> => ball.compareTlo()

    Collections.sort(balls);
    System.out.println(balls);

    List<Bird> birds = new ArrayList<>();

    int x = 3;
    Comparator<Ball> formula = null;
    if(x >= 3) {
      formula  = new BallSortByColor();
    } else {

    }
    // Collections.sort(birds);

    Collections.sort(balls, formula);
    System.out.println("Result is: " + balls);

    
  }
}
