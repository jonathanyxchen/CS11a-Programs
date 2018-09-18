public class ArrayDemo1 {
  public static void main(String[] args){
    // here we declare an array of ints
    // we print it, sort it, and print out the sorted version

    double[] vals = {8.3, 2.3, 5.4, 3.7, 1.6, 1.8, 16, 10.01, -0.54, 2.017, 19.48};

    TextIO.putf("Here is a list of doubles: %n");
    for (int i=0; i<vals.length; i++){
      TextIO.putf("%.3f ",vals[i]); // vals[i] is the ith element of the array
    }
    TextIO.putf("%n");

    java.util.Arrays.sort(vals);

    TextIO.putf("Here is the same list of doubles after being sorted: %n");
    for (int i=0; i<vals.length; i++){
      TextIO.putf("%.3f ",vals[i]); // vals[i] is the ith element of the array
    }
    TextIO.putf("%n");
  }
}