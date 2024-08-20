public class Book1 {
  private double price;
  private String author;

  public Book1(double price, String author) {
    this.price = price;
    this.author = author;
  }

  // transform(substring, replace, bigDeci) => meaning will return new Object


  public static void main(String[] args) {
    // 抽走左set
    Book book = new Book(99.99, "John");
    Book book2 = new Book(99.99, "John");
    Book book3 = book;
    System.out.println(book.price()); // 99.99
    System.out.println(book.author()); // John
    System.out.println(book.equals(book2)); // true
    System.out.println(book3.equals(book)); // true
    System.out.println(book.hashCode()); 
    System.out.println(book2.hashCode()); 
    System.out.println(book3.hashCode()); 

    System.out.println(book2.toString());
    // System.out.println(book.price);
  }

}
