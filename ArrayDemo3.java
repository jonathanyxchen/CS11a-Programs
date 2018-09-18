public class ArrayDemo3 {

  public static void main(String[] args){

    String[] words;

    TextIO.putf("Type a sentence below:%n");
    String sentence = TextIO.getln();

    TextIO.putf("You wrote:%n%s%n",sentence);

    words = sentence.split("\\s+");
    // the "\\s+" is a special string that specifies a pattern of characters
    // in this case it specifies one or more spaces ...
    TextIO.putf("Your sentence has %d words%n and here they are:%n",words.length);

    for(int i=0; i<words.length; i++){
      TextIO.putf("%d. %s%n",i,words[i]);
    }
    TextIO.putf("%n");
  }
}