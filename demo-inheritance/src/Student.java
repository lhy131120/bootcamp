public class Student extends Person { // Person is Parent 
  // private String name;
  // private int age;
  private int studentId;

  // Constructor => the process of costructing student object
  public Student(int studentId, String name, int age) {
    // this.name = name;
    // this.age = age;

    // 1. create Parent object inside Student Object (heap object)
    super(name, age); // calling Parent class 's contructor'
    this.studentId = studentId;
  }

  public void setAge(int age) {
    // 2. call parent object instance method
    //  無意義的method, 專登create 1個object去call果個影之object
    super.setAge(age);
  }

  public int getStudentId() { 
    return this.studentId;
  }

  public static void main(String[] args) {
    Student s = new Student(1, "Vincent", 13);
    System.out.println(s.getAge());
    System.out.println(s.getName());
    System.out.println(s.getStudentId());
  }
}
