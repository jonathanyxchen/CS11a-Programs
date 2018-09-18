/**
P4: write a loop with arrays and conditionals
A: Number 7 game: Write a program P4.java that prints out all the numbers 
that are multiples of 7 in an array of integers. 
For example, for int[]num={6,7,13,14,20,21},
it prints out "The 7-multiple numbers are:7 14 21".
*/
import java.util.Scanner;
public class P4{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int[] num=new int[100];
		for (int i=0;i>=0;i++){
			System.out.println("Please enter an integer:");
			int n=input.nextInt();
			if (n==-1){
				break;
			}
			num[i]=n;
		}
		System.out.print("The 7-multiple numbers are:");
		for (int j=0;j<num.length;j++){
			if (num[j]==0){
				break;
			} else {
				if (num[j]%7==0){
					System.out.printf("%d ",num[j]);
				}	
			}
		}
	}
}
/**
C: For example, if the array is {7, 14, 21,25,36,48},
the result would be "The 7-multiples are:7 14 21".
*/