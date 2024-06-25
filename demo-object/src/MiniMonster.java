import java.util.Objects;

public class MiniMonster {

  private String name;
  private String color;

  public MiniMonster (String name, String color) {
    this.name = name;
    this.color = color;
  }
  
  // hascode used to represent the object has same attr,
  // that will sure those are the same one

  @Override
  public int hashCode() {
    return Objects.hash(this.name,this.color);
  }
}
