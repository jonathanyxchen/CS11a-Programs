public class GuessingGame {
  public static void main(String[] args) {
    // pick a secret number and initialize the guess and guesses variables
    int secret = (int)(1000*Math.random()); // the secret they are trying to guess
    int guess = 0;  // the user's guess
    int guesses = 0;  // the number of guesses they made so far

    TextIO.putf("Guessing Game");
    TextIO.putf("I've picked a number between 0 and 1000%n");
    TextIO.putf("You have 10 attempts to try to guess it!%n%n");

    do {
      guess=TextIO.getlnInt();// prompt user to enter a number between 0 and 1000 (1 pt)

      if (guess==secret){
        System.out.println("You guessed it right!");
        }else if (guess<secret){
        System.out.println("Your guess is too low");
        } else {
          System.out.println("Your guess is too high");
        }
        guesses++;
        // read their guess and increment the guesses variable (1pt)

      // tell them if it is too low, too high, or if they guessed it (4 pts)
     

    } while (guesses<=10&&guess!=secret);  // test to see if the game is over, 4pts i.e. they didn't guess the secret but they have more guesses left

    //  Congratulate them or commiserate, as the case may be
    if (guess==secret){
      TextIO.putf("Good job guessing the secret number: %5d%n",secret);
    } else {
      TextIO.putf("Sorry, the secret number was %5d%n",secret);
    }               
  }
}