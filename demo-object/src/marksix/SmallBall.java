package marksix;

import java.util.Objects;

public class SmallBall extends Ball {

  // attribute
  private String color;

  // constructor
  public SmallBall(int number, String color) {
    super(number);
    this.color = color;
  }

  // getter
  public String getColor() {
    return this.color;
  }

  // toString

  @Override
  public String toString() {
    return "Samll Ball color " + this.color + ", Number is "+ super.toString()+".";
  }

  // equals
  // @Override
  // public boolean equals(Object obj) {
  //   if (this == obj) 
  //   return true;
  //   if (!(obj instanceof SmallBall))
  //   return false;
  //   SmallBall smallball = (SmallBall) obj;
  //   return Objects.equals(this.color, smallball.getColor()) && Objects.equals(this.number, smallball.getNumber());
  // }


  // hashCode
}
