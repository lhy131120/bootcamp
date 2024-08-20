public enum Code {
  INSUFF_BAL(-99, "Withdrawal amount > Account Balance"),
  ;
  
  private int code;
  private String message;

  private Code(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }
}