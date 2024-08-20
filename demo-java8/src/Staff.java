public class Staff {
  private String department;
  private String name;
  private int salary;

  public Staff(String department, String name) {
    this.department = department;
    this.name = name;
  }

  public Staff(String department, String name, int salary) {
    this.department = department;
    this.name = name;
    this.salary = salary;
  }

  public String getDepartment() {
    return this.department;
  }

  public int getSalary() {
    return this.salary;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Staff("+ "dept="+ this.department + " name="+ this.name+")";
  }


  public static void main(String[] args) {
    
  }
}
