import java.util.LinkedList;
import java.util.List;

public class Bank {
  public List<Account> accounts;
  private String address;

  public Bank() {
    this.accounts = new LinkedList<>();
  }

  public void add(Account account) {
    accounts.add(account);
  }

  private static void creditAccount(double amount) {
    new Account().credit(amount);
  }

  public static class Account {
    private static int number = 0;
    private int acctNo;
    private double balance;
    
    public Account () {
      this.acctNo = ++number;
    }

    public int getAccNo() {
      return this.acctNo;
    }

    public void credit(double amount) {
      this.balance += amount;
    }

    public void print() {
      // this.address; // you can't access the outer class instance, there is no relationship
    }
  }


  public static void main(String[] args) {
    
  }
}
