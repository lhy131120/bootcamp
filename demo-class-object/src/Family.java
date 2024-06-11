public class Family {

  // 1. set attributes by Class
  private String name;
  private String relationship;
  private int age;
  private boolean isAudlt;
  private double height;
  private double weight;
  private double bmi;


  //  2. set Instrance Method by Class
  public void setName(String name) {
    this.name = name;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public void isOver18 (boolean isOver18) {
    this.isAudlt = isOver18;
  }

  public static void main(String[] args) {
    Family huiyui = new Family();
    huiyui.setName("hui yui");
    huiyui.setRelationship("little girl");
  }

}
