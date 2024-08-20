//  Annotation -> copmiler help verify if this interface contains ONE method only

@FunctionalInterface
public interface Drivable {
  // 100% implement first then functional interface will correct init for 
  boolean drive(int x);
  
  // int sum(int x, int y);
}
