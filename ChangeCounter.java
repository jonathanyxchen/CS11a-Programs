public class ChangeCounter {
public static void main(String[] args){
int quarters,dimes,nickels,pennies;
int cash;
System.out.printf("Tim's Deluxe Change Counter!%n");
System.out.printf("Quarters:%n");
System.out.printf("dimes:%n");
System.out.printf("nickels:%n");
System.out.printf("pennies:%n");
quarters=TextIO.getlnInt();
dimes=TextIO.getlnInt();
nickels=TextIO.getlnInt();
pennies=TextIO.getlnInt();
cash=25*quarters+10*dimes+5*nickels+1*pennies;
System.out.printf("You have %d/100 dollars",cash);
}
}