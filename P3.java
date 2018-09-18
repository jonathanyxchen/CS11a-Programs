/**
P3: write a nested loop
A: Write a program P3.java that prompts the user for an integer n, and then prints out n triangles, with n lines in 
the nth triangle, and (2n-1) * on the nth line in each triangle. 
For example, if n=3, it would print out
*

 *
***

  *
 ***
***** 
*/
import java.util.Scanner;
public class P3 {
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int n=input.nextInt();
		for (int i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				for (int k=1;k<=i-j;k++){
					System.out.print(" ");
				} 
				for (int p=1;p<=2*j-1;p++){
					System.out.print("*");
				}
				System.out.println("");
			} 
			System.out.println("");
		}
	}
}
/**
C: With n=2, we could get
*

 *
***
With n=6, we could get
*

 *
***

  *
 ***
*****

   *
  ***
 *****
*******

    *
   ***
  *****
 *******
*********

     *
    ***
   *****
  *******
 *********
***********
*/