import java.util.Random;

/**
 * DemoRandom
 */
public class DemoRandom {

  private int baseSalary = 6000;

  public void setBaseSalart(){
    
  }

  public int getSalary(int bouns) {
    return this.baseSalary + bouns;
  }

  public static void main(String[] args) {
    int random = new Random().nextInt(2) + 1; // 1, 2
    int random2 = new Random().nextInt(2); // 0, 1
    int random3 = new Random().nextInt(2) + 49; // 0, 1
    // System.out.println(random);
    // System.out.println(random2);
    System.out.println(random3);

  }
}