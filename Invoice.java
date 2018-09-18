public class Invoice {
public static void main(String[] args){
	String name = args[0];
	String phone = args[1];
	String date = args[2];
	String amount = args[3];
	TextIO.writeFile("invoice.txt");
	TextIO.putf("Invoice for CoolJD Enterprises!!%n");
TextIO.putf("Dear %s,%n",name);
TextIO.putf("Please remit $%s",amount);
TextIO.putf("FOr the DJ gig on %s%n%n", date);
TextIO.putf("Sincerely, Tim Hickey, %s%n", phone);
}
}