package questions;

/**
 * Input: arrivalTime = 15, delayedTime = 5
 * Output: 20 Explanation: Reach at 15+5 = 20 (20:00).
 *
 */
public class JavaQuest11 {
  // You are given a positive integer arrivalTime denoting the arrival time of a
  // train in hours,
  // and another positive integer delayedTime denoting the amount of delay in
  // hours.
  // Calculate Delayed Arrival Time

  public static void main(String[] args) {
    int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0

    System.out.println(delayedArrivalTime1);
    System.out.println(delayedArrivalTime2);
    System.out.println(delayedArrivalTime3);
  }

  public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    // code here ...

    if(arrivalTime < 0 || delayedTime < 0) {
      arrivalTime = Math.abs(arrivalTime);
      delayedTime = Math.abs(delayedTime);
    }

    int resultTime = (arrivalTime + delayedTime) > 24 ? (arrivalTime + delayedTime) - 24 : (arrivalTime + delayedTime) != 24 ? (arrivalTime + delayedTime) : 0;
    return resultTime; 
  }
  
}