package order;

public class Item {
  private double price;
  private int quanity;

  public Item(double price, int qty) {
    this.price = price;
    this.quanity = qty;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQty() {
    return this.quanity;
  }

  public double subtotal() {
    return this.price * this.quanity;
  }
  
}
