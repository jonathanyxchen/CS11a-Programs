public class PA02 {
public static void main(String[] atgs){
	boolean response=false;
	System.out.println("F to C calculator");
	do{
		double f; //temp in F,absolute zero>-459.67
		//prompt the user for a temp
		//read it into f
		//check if it is >-459.67
		//if not, then tell them and give a "continue"
		//statement
		do{
		System.out.println("please enter a number");		
		f=TextIO.getlnDouble();
		if (f<-459.67){
			System.out.println("lower than absolute 0");
			continue;
		}
	}while (f<-459.67);
		System.out.println("We'll calculate here ...");
		System.out.println("Do you want to do another");
		response=TextIO.getlnBoolean();
	}while (response);
	System.out.println("Goodbye!");
}
}