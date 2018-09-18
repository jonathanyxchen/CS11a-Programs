public class CountDown{
	public static void main (String[] args){
		int n;
		n=TextIO.getlnInt();
		for (int i=1;i<=n;i++){
			for (int j=i;j>=1;j--){
				TextIO.putf("%d ",j);
			}
			System.out.println("");
		}
	}
}