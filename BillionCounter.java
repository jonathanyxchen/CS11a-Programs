public class BillionCounter {
public static void main(String[] args){
TextIO.putf("Count to a Billion Demo!%n");
int count=1;
int sum=0;
while (count<=100)
{
	TextIO.putf("%d%n",count);
	sum=count*count+sum;
count=count+1;
}
TextIO.putf("We're done!!%n");
System.out.println(sum);
}
}