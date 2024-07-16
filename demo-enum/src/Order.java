public class Order {                //角色 > 行為
  private OrderStatus orderStatus;
  private int paidAmount;
  private int orderAmount;

  public Order(int orderAmount) {
    this.orderAmount = orderAmount;
    this.orderStatus = OrderStatus.ORDER;
  }

  public void credit(int amount) {
    this.paidAmount += amount;
    // Encapsulation => 即係包function(自己諗的)
    // 呢個位置可以連結埋行為
    if((this.isPaid()) && this.orderStatus == OrderStatus.ORDER) {
      // this.setOrderStatus(this.orderStatus.next());
      upgradePaid();
    }
  }

  public void upgradePaid() {
    this.setOrderStatus(OrderStatus.PAID);
  }

  public boolean isPaid() {
    return this.paidAmount >= this.orderAmount;
  }

  public OrderStatus getOrederStatus() {
    return this.orderStatus;
  }

  public void setOrderStatus(OrderStatus status) {
    this.orderStatus = status;
  }

  public static void main(String[] args) {
    Order order = new Order(100);
    // ... 
    // credit -> 50
    order.credit(50);
    System.out.println(order.isPaid()); // false
    order.credit(50);
    System.out.println(order.getOrederStatus());
  }
}
