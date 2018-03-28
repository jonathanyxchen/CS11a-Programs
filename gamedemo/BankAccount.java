package gamedemo;

public class BankAccount {
  private static int numBankTransactions = 0;

  private String name;
  private int balance;
  private int numAcctTransactions=0;

  public BankAccount(String n, int b){
    this.name = n;
    this.balance = b;
  }

  public BankAccount(String n){
    this.name = n;
    this.balance = 0;
  }


  public String toString(){
    return "< "+ name + " , " + balance + " >";
  }

  private void incrementTransactions(){
    this.numAcctTransactions++;
    BankAccount.numBankTransactions++;
  }


  /**
  adds the amt to the balance field
  */
  public void deposit(int amt){
    this.balance = amt+ this.balance;
    this.incrementTransactions();
  }

  /**
  subtracts the amt from the balance field of this object
  */
  public void withdraw(int amt){
    this.balance -= amt;
    this.incrementTransactions();
  }

  /**
    returns the balance in the account ...
  */
  public int getBalance(){
    this.incrementTransactions();
    return this.balance;
  }

  /**
  transfers the amt to the specified BankAccount
  */
  public void transferTo(int t, BankAccount account){
    this.withdraw(t);
    account.deposit(t);
  }

  /**
  getTransactions()
  @return TotalNumber of Transactions
  */
  public int getTransactions(){
    return this.numAcctTransactions;
  }


  /**
  clearTransactions()
  sets transactions to be zero
  */
  public void clearTransactions(){
    this.numAcctTransactions = 0;
  }

  /**
  gets total of all transactions for all accounts
  @return TotalNumber of Transactions
  */
  public static int getAllTransactions(){
    return BankAccount.numBankTransactions;
  }


  /**
  clearAllTransactions()
  sets global transaction counter to zero
  */
  public static void clearAllTransactions(){
    BankAccount.numBankTransactions = 0;
  }
}