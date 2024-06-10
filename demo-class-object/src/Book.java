public class Book {
  private String name;
  private String author;
  private String isbn;
  private Boolean forKid;
  private Number price;



  // static method belongs to class *****
  // instance method belongs to object *****
  
  // 唔想return就用void
  // set 可以無return

  public void setName(String bookName) {
    this.name = bookName;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setISBN(String isbn) {
    this.isbn = isbn;
  }

  public void setForKid(Boolean status) {
    this.forKid = status;
  }

  public void setPrice(Number price) {
    this.price = price;
  }

  // instrance method 
  public String getName() {
    return this.name;
  }

  public String getAuthor() {
    return this.author + " is the Author of Book!!";
  }

  public Number getPrice() {
    return this.price;
  }


  public static void main(String[] args) {
    Book rayBook = new Book();

    // rayBook.getName("rayBook1");
    rayBook.setPrice(130);
    rayBook.setAuthor("God Father");
    System.out.println(rayBook.getPrice());
    System.out.println(rayBook.getAuthor());
  }
}
