public class DrawSquareBox{
  public static void main(String[] args){
    TextIO.putf("Enter n: ");
    int n = TextIO.getlnInt();
    // draw the first line of n *'s'
    for(int c=0; c<n; c++){
      TextIO.putf("*");
    }
    TextIO.putf("%n");

    // draw the n-2 rows in the middle
    for(int r=1; r<n-1; r++){
      // each of these rows has a * then n-2 spaces, then a *
      TextIO.putf("*");
      for(int c=1; c<n-1; c++){
        TextIO.putf(" ");
      }
      TextIO.putf("*%n");
    }

    // draw the last line of *'s
    for(int c=0; c<n; c++){
      TextIO.putf("*");
    }
    TextIO.putf("%n");
  }
}