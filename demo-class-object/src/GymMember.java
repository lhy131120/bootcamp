public class GymMember {
  private String firstName;
  private String lastName;
  private String mail;
  private String phone;
  private String gender;
  private String membershipLevel;


  // constructor
  // custom constructor / default constructor
  public GymMember() {
    this.membershipLevel = "Level 1";
  }

  public GymMember(String fNmae, String lName, String gender) {
    this.firstName = fNmae;
    this.lastName = lName;
    this.gender = gender;
    this.membershipLevel = "Level 1";
  }
  // public 

  // getter
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public String getMail() {
    return this.mail;
  }
  public String getPhone() {
    return this.phone;
  }
  public String getGender() {
    return this.gender;
  }
  public String getmembershipLevel() {
    return this.membershipLevel;
  }

  // setter
  public void setFristName(String name) {
    this.firstName = name;
  }
  public void setLastName(String name) {
    this.lastName = name;
  }
  public void setMail (String mail) {
    this.mail = mail;
  }
  public void setPhone(String phone){
    this.phone = phone;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public void setMembershipLevel(String level) {
    this.membershipLevel = level;
  }

  public String maxName() {
    return this.firstName + " " + this.lastName;
  }

  // custom toString method
  public String toString() {
    return "Gym Member is " + 
            firstName + " " + 
            lastName + ", mail is " + 
            mail + ", gender is " +
            gender + ", phone number: " +
            phone + ". MemberShip Level: " + 
            membershipLevel + ".";
  }

  public static void main(String[] args) {
    // Create New Gym Member
    GymMember m1 = new GymMember();
    GymMember m2 = new GymMember("Dean", "Winchester", "Male");

    // insert GymMember instance method
    m1.setFristName("Ray");
    m1.setLastName("Lam");
    m1.setGender("Male");
    m1.setPhone("2345 2321");
    m1.setMail("thisismymail@gmail.com");
    m1.setMembershipLevel("Level 3");

    m2.setPhone("9827 1233");
    // m2.setMembershipLevel("Levle 2");

    // print out toString
    System.out.println(m1.toString());
    System.out.println(m2.toString());
  }
}

