public record Book(double price, String author) {  // attribute already set first on this line
  
  // method price(), author(), 

  // Type of instance method
  // getter, setter
  // presentation -> defintion
  // support equals, hashCode, toString
  // class is final (can't be extends)
  // support custom instance method
  // support static method
  // static, static final, final
  // DON'T Support custom constructor

  public static final double MIN_PRICE = 10.0;

  public static double calc (double price, double discount) {
    return price * (1 - 0.2);
  }

  public boolean isTooExpensive() {
    return this.price > 100;
  }

  // all attribute all final
  // public void setPrice(double price) {
  //   this.price = price;
  // }

}
