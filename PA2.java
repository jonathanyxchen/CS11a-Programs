/**
This program counts three_pointers_made, two_pointers_made, freethrows_made(which is 1 point),
three_pointers_missed, two_pointers_missed and freethrows_missed
in a basketball game for either a team or a player, and calculates the 
points and percentage from three poin line, two point line and freethrow line
The program would first check if the number typed in is valid, which is whether the numbers are 
bigger or equal to 0 because a number less than 0 in a basketball game is invalid. 
After printing out the result, it will ask if you want to calculate another athlete's stats. 
Test cases:
0 three_pointers_made, 1 three_pointers_missed,
0 two_pointers_made, 1 two_pointers_missed,
0 freethrows_made, 1 freethrows_missed, 
the answer is 0 points, 0.00 percent from three point line, 
0.00 percent from two point line, and 0.00 percent from freethrow line.

1 three_pointers_made, 2 three_pointers_missed,
3 two_pointers_made, 4 two_pointers_missed,
5 freethrows_made, 6 freethrows_missed, 
the answer is 14 points, 33.33 percent from three point line, 
42.86 percent from two point line, and 45.45 percent from freethrow line.

4 three_pointers_made, 6 three_pointers_missed,
5 two_pointers_made, 5 two_pointers_missed,
8 freethrows_made, 2 freethrows_missed, 
the answer is 30 points, 40.00 percent from three point line, 
50.00 percent from two point line, and 80.00 percent from freethrow line.

*/
public class PA2 {
public static void main(String[] args){
	Double three_pointers_made,two_pointers_made,freethrows_made,three_pointers_missed,two_pointers_missed,freethrows_missed;
	Double points,three_pointers_percentage,two_pointers_percentage,freethrows_percentage;
	boolean response=false;
	System.out.printf("How many points do you get and what's your percentage?%n");
	do {
		do{
			System.out.printf("three_pointers_made:%n");
			three_pointers_made=TextIO.getlnDouble();
			System.out.printf("three_pointers_missed:%n");
			three_pointers_missed=TextIO.getlnDouble();
			System.out.printf("two_pointers_made:%n");
			two_pointers_made=TextIO.getlnDouble();
			System.out.printf("two_pointers_missed:%n");
			two_pointers_missed=TextIO.getlnDouble();
			System.out.printf("freethrows_made:%n");
			freethrows_made=TextIO.getlnDouble();
			System.out.printf("freethrows_missed:%n");
			freethrows_missed=TextIO.getlnDouble();
			if (three_pointers_made<0||two_pointers_made<0||freethrows_made<0||three_pointers_missed<0||two_pointers_missed<0||freethrows_missed<0){
				System.out.println("Any input numbers here could not be less than 0");
				System.out.println("Please reenter");
        }
      } while (three_pointers_made<0||two_pointers_made<0||freethrows_made<0||three_pointers_missed<0||two_pointers_missed<0||freethrows_missed<0);
	points=3*three_pointers_made+2*two_pointers_made+1*freethrows_made;
	System.out.printf("You score " + points +" points in the game!%n");
	three_pointers_percentage=three_pointers_made/(three_pointers_missed+three_pointers_made)*100;
	System.out.printf("You shoot %1.2f percent from three point line%n", three_pointers_percentage);
	two_pointers_percentage=two_pointers_made/(two_pointers_missed+two_pointers_made)*100;
	System.out.printf("You shoot %1.2f percent from two point line%n",two_pointers_percentage);
	freethrows_percentage=freethrows_made/(freethrows_made+freethrows_missed)*100;
	System.out.printf("You shoot %1.2f percent from freethrow line%n",freethrows_percentage);
	System.out.println("Do you want to calculate the stats of another player?");
	response=TextIO.getlnBoolean();
}while(response);
	System.out.println("Hope to see you again!");
}
}