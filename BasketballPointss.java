/**
This program counts three_pointers, two_pointers and  freethrows(which is 1 point)
in a basketball game for either a team or a player, and calculates the 
points of the team or the player
*/
public class BasketballPointss {
public static void main(String[] args){
Int three_pointers,two_pointers,freethrows;
Int points;
System.out.printf("How many points do you get?%n");
System.out.printf("three_pointers:%n");
three_pointers=TextIO.getlnInt();
System.out.printf("two_pointers:%n");
two_pointers=TextIO.getlnInt();
System.out.printf("freethrows:%n");
freethrows=TextIO.getlnInt();
points=3*three_pointers+2*two_pointers+1*freethrows;
System.out.printf("You score %d points in the game!",points);
}
}