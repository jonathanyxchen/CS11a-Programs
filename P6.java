/**
P6: explain in detail one part of a trace
A: The user is required to write out the result of the problem. 
Explain the number of i and j when it prints out 5*8=40 and 4*9=36. 
*/
import java.util.Scanner;
public class P6{
	public static void main (String[] args){
		for (int i=0;i<=8;i++){
			for (int j=0;j<=i;j++){
				int product=(i+1)*(j+1);
				System.out.printf((j+1)+"*"+(i+1)+"="+product+" ");
			}System.out.println("");
		}
	}
}
/**
C. The program would print out the multiplication table from 1 to 9 as follows: 
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16
1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
When 5*8=40, i=7, j=4;
When 4*9=36, i=8, j=3.
*/