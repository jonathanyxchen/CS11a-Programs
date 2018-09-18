public class MyMath {
  // this one doesn't have a main, since it is defining a library to be used by other classes in the same directory/folder

    public static int counter=0; // this is a counter variable that can be used by anyone with access to this class

    /**
    max(vals) -- takes an array of doubles and returns the largest value stored in the array
    */
    public static double max(double[] vals){
        double maxValue = vals[0];
        for(int i=1; i<vals.length; i++){
            if (vals[i]>maxValue) {
                maxValue = vals[i];
            }
        }
        return maxValue;
    }

    public static void printArray(int[] vals){
        TextIO.putf("[ ");
        for(int i=0; i<vals.length-1; i++){
            TextIO.putf("%d, ",vals[i]);
        }
        TextIO.putf("%d ]",vals[vals.length-1]);
    }
}