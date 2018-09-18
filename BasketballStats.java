/**
This program counts three_pointers_made, two_pointers_made, freethrows_made(which is 1 point),
three_pointers_missed, two_pointers_missed and freethrows_missed
in a basketball game for either a team or a player, and calculates the 
points and percentage from three poin line, two point line and freethrow line
*/
public class BasketballStats {
	public static void main(String[] args){
		Double three_pointers_made,two_pointers_made,freethrows_made,three_pointers_missed,two_pointers_missed,freethrows_missed;
		Double points,three_pointers_percentage,two_pointers_percentage,freethrows_percentage;
		System.out.printf("How many points do you get and what's your percentage?%n");
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
		points=3*three_pointers_made+2*two_pointers_made+1*freethrows_made;
		System.out.printf("You score " + points +" points in the game!%n");
		three_pointers_percentage=three_pointers_made*100/(three_pointers_missed+three_pointers_made);
		System.out.printf("You shoot %1.2f percent from three point line%n", three_pointers_percentage);
		two_pointers_percentage=two_pointers_made*100/(two_pointers_missed+two_pointers_made);
		System.out.printf("You shoot %1.2f percent from two point line%n", two_pointers_percentage);
		freethrows_percentage=freethrows_made*100/(freethrows_made+freethrows_missed);
		System.out.printf("You shoot %1.2f percent from freethrow line%n", freethrows_percentage);
	}
}