/** 
Complete the program below by writing
max4(a,b,c,d) -- returns the largest of the 4 integer values a,b,c ,d
demo(x,y) -- returns the largest of x,y,x+y,x-y (calling max4)
*/

public class Max4Demo {
  public static void main(String[] args){
    System.out.printf("Enter two integers, one per line%nx: ");
    int x = TextIO.getlnInt();
    System.out.printf("y: ");
    int y = TextIO.getlnInt();
    int z = demo(x,y);
    System.out.printf("The largest of x,y,x+y,x-y is %d%n",z);
  }

  // write code for demo 

  // write code for max4 

  
}