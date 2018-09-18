/**
Author:Yuxuan Chen
*/
package chat;

import java.util.Scanner;
import lib.StringArray;

public class ChatBot {


  /**
  carry on an ordering process of domino pizza
  @param args an array of Strings which we ignore
  */
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String [] history = new String[1000];


    System.out.println("Welcome to the Domino Pizza Online Ordering!");
    System.out.println("How can I help you?");
    boolean done=false;
    int i=0;
    int count = 0;
    int k;

/**
This parts reads the input and see if it's in the kind of questions that the system
accepts. Then it gives corresponding answers. It also generates random questions asking 
if a previous answer is still true.
*/
    while (!done){
      String userResponse = scanner.nextLine();
      String[] words = userResponse.split("\\s+");
      String myResponse = generateResponse(words);
        history[i]=userResponse;
        count++;
        i++;
      for (int j=0; j<count-1; j++){
        if (history[j].equals(userResponse)){
          if (j<10){
            k=(int)(Math.random()*10);
            while(k > count){
              k=(int)(Math.random()*10);}
            System.out.println("Earlier you said "+history[k]+" is that still true?");
          } else if (j>=10&&j<100){
              k=(int)(Math.random()*100);
              while(k > count){
              k=(int)(Math.random()*100);}
            System.out.println("Earlier you said "+history[k]+" is that still true?");
          } else if (j>=100&&j<1000) {
              k=(int)(Math.random()*1000);
              while(k > count){
              k=(int)(Math.random()*1000);}
            System.out.println("Earlier you said "+history[k]+" is that still true?");
          } else if (j == 1000){
            System.out.println("We have too many orders today. Please try next time.");
            break;
          }
        }
      }
      System.out.printf("%s%n%n",myResponse);
      done = userResponse.equals("bye");
    }
  }

  /**
    generates a String in response to a user response
    passed in as an array of words
    @param words the user's response
    @return a string responding to the user's words
  */
  public static String generateResponse(String[] words){
    if (StringArray.intersects(words, phone)){
      return "The phone number is 800-252-4031";
    } else if (StringArray.intersects(words, website)){
      return "The website is https://www.dominos.com/en/";
    } else if (StringArray.intersects(words,author)){
      return "The author is Yuxuan Chen";
    } else if (StringArray.intersects(words,basicOrders)) {
      // respond to a short response
      return StringArray.pickRandom(basicResponses);
    } else if (StringArray.intersects(words,pizzaKind)){
      // respond to a user response mentioning a family member
      return StringArray.pickRandom(pizzaResponses);
    } else if (StringArray.intersects(words,sauceKind)) {
      // 50% of the time pick a random question
      return StringArray.pickRandom(sauceResponses);
    } else if (StringArray.intersects(words,toppingKind)) {
      // the rest of the time pick a general response
      return StringArray.pickRandom(toppingResponses);
    } else if (StringArray.intersects(words,yesNo)){
      return "Okay. What else do you want?";
    } else if (StringArray.intersects(words,bye)){
      return "";
    } else {
      return StringArray.pickRandom(unavailableResponses);
    }

  }

  /**
    an array of word "phone"
  */
  public static String[] phone = {"phone"};

  /**
    an array of word "website"
  */
  public static String[] website = {"website"};

  /**
    an array of word "author"
  */
  public static String[] author = {"author"};

  /**
    an array of words "yes" or "no"
  */
  public static String[] yesNo = {"yes", "no"};

  /**
    an array of word "bye"
  */
  public static String[] bye = {"bye"};

  /**
    an array of basic words for ordering
  */
  public static String[] basicOrders = {"buy", "order", "want", "eat",
     "purchase", "build", "pizza", "food", "would", "like"};

   /**
     an array of responses to basic order words
   */
   public static String[] basicResponses =
   {
       "What do you want to order?",
       "What kind of pizza would you like?",
       "Why don't you tell me about the pizza you like?",
       "Please tell me what kind of pizza is your favourite.",
       "Can we start ordering the kind of pizza now?",
       "What is your favourite pizza?",
       "Please specify the pizza you would like to order.",
       "Let me know what pizza you would like.",
       "Now it's the chance for you to build your own pizza!",
       "Hey! Pizza time! What would you like?"
   };

  /**
    an array of sauce kind
  */
   public static String[] sauceKind = {"robust", "inspired", "tomato", "hearty", 
   "marinara", "BBQ", "garlic", "parmesan", "white", "alfredo"};

   /**
     an array of general responses to sauce kind
   */
   public static String[] sauceResponses =
      {
        "What toppings would you like?",
        "Any ideas for toppings?",
        "Tell us about your toppings choice.",
        "What's your favourite toppings?",
        "Choose toppings please.",
        "Now it's the time to tell us the toppings.",
        "Topping is important for a pizza! What's your choice?",
        "Would you like any kind of sauce for your toppings?",
        "What toppings do you want here?",
        "This is your opportunity to choose toppings for you!"
      };

  /**
    an array of pizza kind
  */
  public static String[] pizzaKind = {"hand", "tossed", "handmade", "pan",
    "thin","crunchy","seasoned", "random", "brooklyn", "gluten"};

  /**
    an array of responses to pizza kind
  */
  public static String[] pizzaResponses =
     {"What sauce would you like?",
      "Any ideas for sauce?",
      "Tell us about your sauce choice.",
      "What's your favourite sauce?",
      "Choose a sauce please.",
      "Now it's the time to tell us the sauce.",
      "Sauce is important for a pizza! What's your choice?",
      "Would you like any kind of sauce for your pizza?",
      "What sauce do you want here?",
      "This is your opportunity to choose a sauce for you!"
    };

  /**
    an array of topping kind
  */
  public static String[] toppingKind = {"pepperoni", "beef", "salami", "ham", "sausage", 
    "steak", "bacon", "chicken", "pineapple", "spinach", "mushroom"};

  /**
    an array of response to topping kind
  */
  public static String[] toppingResponses =
     {
       "Thank you for ordering! Your pizza will be ready in 30-45 minutes."
    };

  /**
    an array of response to user's comment that cannot be recognized by the system
  */
  public static String[] unavailableResponses =
      {
        "Sorry, we don't have this for our ordering. Please check www.dominos.com for details. "
      };
}





/**
an annotated script of your interaction:
Welcome to the Domino Pizza Online Ordering!
How can I help you?
i would like to order a pizza with pineapple and bacon on it
Now it's the chance for you to build your own pizza!（For any words 
indicating the intention of the user to bue pizza here, it would 
random out an answer asking the specific kind of pizza)

ok, i just want fking bacon and pineapple on the pizza
What kind of pizza would you like?

handmade pan
Tell us about your sauce choice.(For answers about the kind of pizza,
it would randomly the request for the kind of sauce user wants)

white something sauce
Topping is important for a pizza! What's your choice?(For answers about
the kind of sauce, it would ask for the topping)

pineapple and bacon
Thank you for ordering! Your pizza will be ready in 30-45 minutes.(For answers
toppings, it would give this answer)

phone
The phone number is 800-252-4031(For questions consisting the word "phone",
it would give the official phone number of domino pizza)

website
The website is https://www.dominos.com/en/(For questions consisting the word "website",
it would give the official website of domino pizza)

author
The author is Yuxuan Chen(For questions consisting the word "author",
it would give my name)

asd
Sorry, we don't have this for our ordering. Please check www.dominos.com for details.
(If the answer is not listed of any kind, it would give this answer)

asd
Earlier you said handmade pan is that still true?(At any time, the program might ask
if a specific answer the user gave before is still true or not)
Sorry, we don't have this for our ordering. Please check www.dominos.com for details.



Explanation of the program:
The challenge of the program is mainly put the previous answers in an array and 
ask if it's still ture later randomly. I asked one of my friends and we figured out together. 
My intention of designing this program is that I ordered domino pizza very often through their
website and I feel a chat bot would make the ordering process more interesting. If I have more
time, I would design more functions for ordering, as for this program, users can order pizza only, 
and it's very likely that the user would type in a word that is not listed as any kind. 
*/
