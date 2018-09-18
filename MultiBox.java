public class MultiBox {
	public static void main(String[] args){
		int a,b;
		System.out.println("a=");
		a=TextIO.getlnInt();
		System.out.println("b=");
		b=TextIO.getlnInt();
		for (int i=0;i<a;i++){
			for (int j=0;j<b;j++){
				for (int k=0;k<a;k++){
					System.out.printf("X");
				}
				System.out.printf(" ");
			}
			System.out.printf("%n");
		}
	}
}