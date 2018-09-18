public class cao{
	public static void main (String[] args){
		for(int i=2; i<7; i+=4){
      int p=1;
      TextIO.putf("%4d ",p);
      for (int j=0; j<i; j++){
        p = p*(i-j)/(j+1);
        TextIO.putf("%4d ",p);
      }
      TextIO.putf("%n");
    }
	}
}