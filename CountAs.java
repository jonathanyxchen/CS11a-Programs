public class CountAs {
	public static void main (String[] args){
	int[] grades = {95,90,100,88,93,91,74,85,99};
	int[] As= new int [100];
	int k=0;
	for (int i=0;i<grades.length;i++){
		if (grades[i]>=93&&grades[i]<=100){
			As[k]=grades[i];
			k++;
		}
	}
	TextIO.putf("There were %d As: ", k);
	for (int l=0;l<k;l++){
		TextIO.putf("%d",As[l]);
		if (l!=k-1){
			TextIO.putf(",");
		}
	}
}
}