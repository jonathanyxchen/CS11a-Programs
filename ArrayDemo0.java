public class ArrayDemo0 {
  
  public static void main(String[] args){
    // here we declare an array of the first 20 prime numbers ...
    int[] primes = {2,3,5,7,11,13,19,23,29,31,37,41,43,47,53,59,61,67,71,79};

    do {

      TextIO.putf("Enter a number from 1 to 20: ");
      int n = TextIO.getlnInt();
      int p = primes[n-1]; // we can access an element of an array with square brackets
      // the first element of the array is primes[0] because array indexing starts at 0
      // the last element of the array is primes[19] which is the 20th prime
      TextIO.putf("The %dth prime is %d%n",n,p);
      TextIO.putf("Want to try again? (y or n): ");

    } while (TextIO.getlnBoolean());

    TextIO.putf("bye!");

  }
}