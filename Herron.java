public class Herron {
public static void main(String[] args){
Double a,b,c;
Double s,area;
System.out.printf("a:%n");
a=TextIO.getlnDouble();
System.out.printf("b:%n");
b=TextIO.getlnDouble();
System.out.printf("c:%n");
c=TextIO.getlnDouble();
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println(area);
}
}