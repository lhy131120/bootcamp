public class BusinessException extends Exception{
  private int errorCode;

  public int getErrorCode() {
    return this.errorCode;
  }

  // public BusinessException(int errorCode, String msg) {
  //   super(msg);
  //   this.errorCode = errorCode;
  // }

  public BusinessException(Code code) {
    super(code.getMessage());
    this.errorCode = code.getCode();
    // super();
    // this.errorCode = errorCode;
  }

  public String ShowErrorStatus() {
    return "Error" + this.getErrorCode() + " - " + this.getMessage();
  }

}
