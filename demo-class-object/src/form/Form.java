package form;
public class Form {
  private String firstName;
  private String lastName;
  private Address address;

  public Form (String fristName, String lastName, Address address) {
    this.firstName = fristName;
    this.lastName = lastName;
    this.address = address;
  }

  // getter
  public String getfirstName() {
    return this.firstName;
  }
  public String getlastName() {
    return this.lastName;
  }
  public Address getAddress() {
    return address;
  }

  // setter
  public void setFristName(String fristName) {
    this.firstName = fristName;
  }
  public void setlasttName(String lastName) {
    this.firstName = lastName;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  public String toString() {
    return this.firstName + " " + this.lastName + " " + this.address;
  } 
}

