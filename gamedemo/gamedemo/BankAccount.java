package gamedemo;

public class BankAccount {
  private String name;
  private int balance;
  private numTransections

public BankAccount(String n, int b){
  this.name =n;
  this.balance=b;
}

public BankAccount(String n){
  this.name=n;
  this.balance=0;
}

  public String toString(){
    return "< "+ name + " , " + balance + " >";
  }


  /**
  adds the amt to the balance field
  */
  public void deposit(int amt){
    this.balance = amt+ this.balance;
    numTransections++;
  }

  /**
  subtracts the amt from the balance field of this object
  */
  public void withdraw(int amt){
    this.balance -= amt;
    numTransections++;
  }

  /**
    returns the balance in the account ...
  */
  public int getBalance(){
    numTransections++;
    return this.balance;
  }

  /**
  transfers the amt to the specified BankAccount
  */
  public void transferTo(int t, BankAccount account){
    this.withdraw(t);
    account.deposit(t);
  }



}
