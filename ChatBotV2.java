import java.util.Scanner;
import java.util.Random;

public class ChatBotV2 {
  private static Random random;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    random = new Random();

    System.out.println("Welcome to the ChatBot Counseling Center!");
    System.out.println("How can I help you?");
    boolean done=false;
    while (!done){
      String userResponse = scanner.nextLine();
      String[] words = userResponse.split("\\s+");
      String myResponse = generateResponse(words);
      System.out.printf("%s%n%n",myResponse);
      done = userResponse.equals("bye");
    }
  }

  static String[] generalResponses =
     {
       "Interesting. Please go on ...",
       "I see. Can you tell me more?",
       "Why don't you tell me about your mother.",
       "Have you spoken to your father about this?",
       "Is that right?"
     };



  public static String pickRandom(String[] responses){
    int k = random.nextInt(responses.length);
    return responses[k];
  }

  public static String generateResponse(String[] words){
    if (words.length <=3) {
      return "Please expand on that...";
    } else {
      return pickRandom(generalResponses);
    }

  }

}