public enum Currency {
  HKD("HKD", 2),
  USD("USD" , 23),
  JPY("YEN", 22332),
  ;


  private final String description;
  private final int DBValus;


  private Currency (String description, int DBValue) {
    this.description = description;
    this.DBValus = DBValue;
  }

  public String getDescription() {
    return this.description;
  }

  public int getDBValus() {
    return this.DBValus;
  }

  @Override
  public String toString() {
    return "Currenct( description = " + this.description + this.DBValus;
  }

  // 2->USD  3->JPY
  public static Currency get(int DBValue) {
    for (Currency curr : Currency.values()) {
      if(DBValue == curr.getDBValus()) {
        return curr;
      }
    }
    return null;
  }

  // DBValues Static method!!!!, no this, use Class Currency
  public static int get(Currency currency) {
    return currency.getDBValus();
  }

  public static String fulldescription(Currency currency){
    // if(currency == Currency.HKD) {
    //   return "It's Hong Kong Dallors";
    // } else if(currency == Currency.USD) {
    //   return "It's US Dallors";
    // } else if(currency == Currency.JPY){
    // return "It's JPY Dallors";
    // }
    // return null;
    // Alternative switch (before java 14)
    switch (currency) {
      case HKD:
        return "It's HK Dollars!";
      case USD:
        return "It's US Dollars!";
      case JPY:
        return "It's JPY Dollars!";   
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    Currency currency = Currency.HKD;

    // 1. Default method
    System.out.println(currency.name());
    // 2. values
    for(Currency c : Currency.values()) {
      System.out.println(c.getDescription());
    }

    System.out.println(Currency.values().length);

    if (currency == Currency.USD) {
      System.out.println("it is USD");
    } else if(currency == Currency.HKD){
      System.out.println("IT is " + currency.getDescription());
    } else {
      System.out.println("It is " + currency.getDescription());
    }

    System.out.println(Currency.HKD.hashCode()); // 唯一
    System.out.println(Currency.USD.hashCode()); //全JAVA第

    // System.out.println(Currency.HKD.valueOf(null));

    System.out.println(Currency.get(2).toString());


    String x = "cba";
    // NOTOK
    // 唔應該 variable 做
    if(x.equals("abc")) { // potentially null pointer excetions

    }

    // OK
    if("abc".equals(x)) {

    }

    // 3. valueOf() => static method
    // Not type safe, because you can input lots of value excluded Enum
    System.out.println(Currency.valueOf("HKD").name());   // "HKD", "HKD"
  }
}
