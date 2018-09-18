import java.awt.Color;

public class Average{
public static void main(String[] args){
double a,b; //two numbers given by the user
double amean;
double gmean;
System.out.println("Hello World");
System.out.println("Enter two numbers:");
a=TextIO.getlnDouble();
b=TextIO.getlnDouble();
amean=(a+b)/2;
gmean=Math.sqrt(a*b);
System.out.printf("%10.6f - arithmetic mean%n", amean);
System.out.printf("%10.6f - geometric mean%n", gmean);
}
}