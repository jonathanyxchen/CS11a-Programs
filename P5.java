/**
P5: write a program working with text
A: Write a program P5.java that prompts the user for a sentence, and then prints 
out the 1st, 4th, 7th, ... word of the sentence. This process continues until the 
user enters "end" and it will print out "Thank you for using".
*/
import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String text = input.nextLine();
        while (!text.equals("end")){
            String[] words = text.split(" "); 
            System.out.println("Code:");
            for(int i=0; i<words.length; i++) {
                if (i%3==0){
                    System.out.printf("%s ",words[i]);
                } 
            } 
            System.out.println("");
            text=input.nextLine();
        }
        System.out.println("Thank you for using");
    }
}
/**
C: If entering sentence "Tim is the best teacher at Brandeis University", 
it would print out "Tim best Brandeis". 
If entering sentence "Computer Science is my favourite subject of all time",
it would print out "Computer my of".
*/