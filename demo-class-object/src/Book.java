public class Book {
  private String bookName;
  private String author;
  private String isbn;
  private boolean isKidsBook;
  private String[] bookTypes;
  private String msg;

  // constructor
  public Book(String author, String isbn, boolean forkids, String[] bookTypes) {
    this.author = author;
    this.isbn = isbn;
    this.isKidsBook = forkids;
    this.bookTypes = bookTypes;
  }


  // getter
  public String getBookName() {
    return this.bookName;
  }
  public String getAuthor() {
    return this.author;
  }
  public String getIsbnr() {
    return this.isbn;
  }
  public boolean getisKidsBook() {
    return this.isKidsBook;
  }
  public String[] getbookTypes() {
    return this.bookTypes;
  }
  
  // setter
  public void setBookName(String bookName) {
    this.bookName = bookName;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
  public void isKidsBook(boolean forkids) {
    this.isKidsBook = forkids;
  }
  public void setBookTypes(String[] types) {
    this.bookTypes = types;
  }

  public String toString() {
    String result = isKidsBook ? "suitable for kids" : "not good for kids";
    return "Book name is " + bookName +
           ", Author is " + author + 
           ", Book is " + result +
           ", You can find information by ISBN no.:" +isbn;
  }


}
