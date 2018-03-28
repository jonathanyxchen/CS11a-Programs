package gamedemo;

public class GameTest{
  public static void main(String[] args){
   BankAccount a1 = new BankAccount("Tim's gold", 1000);


   BankAccount a2 = new BankAccount("Willam's gold");
   a2.deposit(250);

   System.out.println("a1="+a1);
   System.out.println("a2="+a2);

   // deposit 10000 into a1
   a1.deposit(10000);
   // withdraw 50 from a2
   a2.withdraw(50);
   // transfer 100 from a1 to a2
   a1.transferTo(100,a2);

   // printout the balance from a1 and a2
   System.out.println("Tim has "+a1.getBalance()+" gold pieces");
   System.out.println("Will has "+a2.getBalance()+" gold pieces");

  }
}
