import java.util.Scanner;
/**
  This is a refactored version of the DrawSquareBox program
  from the Quiz 2 Practice Problem Set on PRA
*/
public class DrawSquareBox2{


  /**
    ask the user for an integer n and draw an nxn box
  */
  public static void main(String[] args){
    int n = askUserForN();
    drawNxNbox(n);
  }

  /**
  drawNxNbox(n) draws the outline of an nxn box made from asterisks
  @param n the size of the box to draw
  */
  public static void drawNxNbox(int n){
    drawNstars(n);
    for(int r=1; r<=n-2; r++){
      drawMiddleRow(n);  // a star, n-2 spaces, a star
    }
    drawNstars(n);
  }

  /**
  drawNstars(n) draws a line of n asterisks followed by a newline
  @param n the number of asterisks to draw
  */
  public static void drawNstars(int n){
      for (int i=1;i<=n;i++){
          System.out.print("*");
      } 
      System.out.println("");
  }


  /**
  drawMiddleRow(n) draws a line with two asterisks separated by n-2 spaces
  with a newline character at the end
  @param n the number of characters in the row (2 asterisks and n-2 spaces)
  */
  public static void drawMiddleRow(int n){
    System.out.print("*");
    for (int i=1;i<=n-2;i++){
      System.out.print(" ");
    }
    System.out.println("*");
  }



  /**
  askUserForN() prompts the user to enter a number, reads it, and returns it
  @return the integer n which the user enters
  */
  public static int askUserForN(){
    System.out.print("Enter:");
    Scanner input = new Scanner(System.in);
    int a=input.nextInt();
    return a;
  }

}