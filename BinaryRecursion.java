public class BinaryRecursion{
    public static void main(String[] args){
      java.util.Scanner s = new java.util.Scanner(System.in);
      System.out.printf("Enter a number n and I'll convert it to binary: %n");
      int n = s.nextInt(); s.nextLine();
      String b = convertToBinary(n);
      System.out.printf("%d base 10 is %s base 2%n",n,b);
    }

    public static String convertToBinary(int k){
      // first we handle the "base" case which stops the recursion
      if (k==0) {
        return "0";
      } else if (k==1) {
        return "1";
      }

      // now we handle the "recursive" case
      // the idea is if we could convert k/2 to a binary number w
      // 2*(k/2) would be "w0" and 2*(k/2)+1 would be "w1"
      // and we've reduced the problem to a similar one where n is half as large!
      int m = k/2;
      int r = k-2*m;  // the remainder, also k%2
      String w = convertToBinary(m);
      if (r==0) {
        return w+"0";
      } else {
        return w+"1";
      }
    }
}