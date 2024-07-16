public class CurrencyHonler {
  private final String currency;
  private final int DBValue;

  public CurrencyHonler(String currency, int DBValue){
    this.currency = currency;
    this.DBValue = DBValue;
  }

  public String getCurrency() {
    return this.currency;
  }

  public static void main(String[] args) {
    // 1. Cannot guarantee there is obly
    CurrencyHonler ch1 = new CurrencyHonler("HKD", 1);
    CurrencyHonler ch2 = new CurrencyHonler("HKD", 1);

    System.out.println();
  }

  public boolean isHKD() {
    return "HKD".equals(this.currency);
  }

  public static boolean isHKD(CurrencyHonler holder) {
    return "HKD".equals(holder.getCurrency());
  }


  // 2. System is not ad good idea to represent that with finite numbers of Object

  // 總結：由於String有無限的可能，Enum就定義左系列的parameters, 所以在compiler time已經可以找到錯，並不是

  // ValueOf

}
