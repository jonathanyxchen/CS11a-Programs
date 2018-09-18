/**
P1: write code using conditionals
A. Write a program P1.java that tests whether a year is a leap year or not. It prompts the user to enter a year number, 
and tells the user if it's a leap year. More specifically, if it is a multiple of 4 but not a multiple of 100, or 
a multiple of 400, it's a leap year. 
If the user enters 2016, it prints out "2016 is a leap year".
If the user enters 2100, it prints out "2100 is not a leap year".
If the user enters 2000 it prints out "2000 is a leap year".
*/
import java.util.Scanner;
public class P1 {
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a year:");
		int n = input.nextInt();
		if (n%4==0) {
			if (n%100==0){
				if (n%400==0){
					System.out.printf("%d is a leap year", n);
				} else {
					System.out.printf("%d is not a leap year", n);
				}
			} else {
				System.out.printf("%d is a leap year", n);
			} 
		} else {
			System.out.printf("%d is not a leap year", n);
		}
	}
}
/**
C. With n=2016, we could get 2016 is a leap year. 
With n=2018, we could get 2018 is not a leap year. 
With n=2100, we could get 2100 is not a leap year. 
With n=2000, we could get 2000 is a leap year. 
*/