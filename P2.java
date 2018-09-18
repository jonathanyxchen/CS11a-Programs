/**
A. Write a program P2.java which prompts the user for a positive integer and calculates the sum
of all the integers from 1 to that integer. 
For example, if n=10, it would print "The sum from 1 to 10 is 55". 
If n=100, it would print "The sum from 1 to 100 is 5050".
If n=-10, it would not print anything. 
*/
import java.util.Scanner;
public class P2 {
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a positive integer:");
		int n=input.nextInt();
		int sum=0;
		if (n>0){
			for (int i=1;i<=n;i++){
				sum=i+sum;
		} System.out.printf("The sum from 1 to %d is %d", n, sum);
		}
	}
}
/**
C. With n=10, we could get the sum from 1 to 10 is 55. 
With n=100, we could get the sum from 1 to 100 is 5050. 
With n=1000, we could get the sum from 1 to 1000 is 500500. 
*/