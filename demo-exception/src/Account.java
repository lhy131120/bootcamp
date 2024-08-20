import javax.naming.InsufficientResourcesException;

public class Account {
  private double balance;

  public double getBalance() {
    return this.balance;
  }

  public Account() {
    this.balance = 0.0d;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void credit(double amount) {
    this.balance += amount;
  }

  public void debit(double amount) throws InsufficientBalanceExcepton{
    if(this.balance < amount)
      // throw new BusinessException(-99, "Withdrawal amount > Account Balance");
      // throw new BusinessException(Code.INSUFF_BAL);
      // throw new IllegalArgumentException();
      throw new InsufficientBalanceExcepton();
    this.balance -= amount;
  }


  public static void main(String[] args) {
    Account account = new Account();
    account.credit(100);
    try {
      account.debit(70);
      account.debit(80);
    } catch (BusinessException e) {
      System.out.println(e.ShowErrorStatus());
    }
    System.out.println(account.getBalance());
  }
}
