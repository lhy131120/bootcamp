import java.time.LocalDate;
import java.util.Objects;
import java.util.random.RandomGenerator.LeapableGenerator;

public class Book {
  private String author;
  private LocalDate publishDate;

  public Book(String author, LocalDate publishDate) {
    this.author = author;
    this.publishDate = publishDate;
  }

  // getter

  public LocalDate getPublishDate() {
    return this.publishDate;
  }

  public String getAuthor() {
    return this.author;
  }

  @Override
  public boolean equals(Object obj) {
    // call method 果個就係this
    if (this == obj) 
      return true;
    if(!(obj instanceof Book))  
    // instanceof  is cjecking if the objecy pointing by refence is an object produced by Book Class
      return false;
    

    Book book = (Book) obj; // 強行改變 type? 
    return Objects.equals(this.author, book.getAuthor())
          && Objects.equals(this.getPublishDate(), book.getPublishDate());
  }

  // if you don't 
  @Override
  public int hashCode() {
    return Objects.hash(this.author, this.publishDate);
  }

  public int hashCode;
  public static void main(String[] args) {
    Book b1 = new Book("John ", LocalDate.of(2002, 12, 12));
    Book b2 = new Book("John ", LocalDate.of(2002, 12, 12));
    
    // System.out.println(b1.hashCode());
    // System.out.println(b2.hashCode());
    Book b3 = new Book("John ", LocalDate.of(2002, 12, 13));
    // System.out.println(b3.hashCode());

    // System.out.println(b1 == b2);
    // System.out.println(System.identityHashCode(b1));
    // System.out.println(System.identityHashCode(b2));


    // Object class has equals method
    // if you do not override, equals by default checking object address 
    System.out.println(b1.equals(b2)); // false, if you do not override
    System.out.println(b1.equals(b3)); // false, After override equals method 

    // if both objects are located in fiffe
    // System.out.println(b1.equals(new Cat()));

    String str = "abc";
    System.out.println(str.hashCode());
    // maybe exist same hash code with another String
    String str2 = "lamkdmasjfjnwnewddxyz";  // hashcode 相同 但值有機會不，因為有overflow
    System.out.println(str2.hashCode());

    Integer i3 = 365;
    System.out.println(i3.hashCode());


    // "compile time" determain if sa is able to call equals()
    // "run time" determine the implementation(method content) of equals() method
    Object s1 = new String("abcd");
    Object s2 = new String("abcd");
    System.out.println(s1.equals(s2)); // true ( Runtime: String.equals() )

    Object s3 = new Object();
    Object s4 = new Object();
    System.out.println(s3.equals(s4)); // false (Objects.equals )

    
 

  }
}
